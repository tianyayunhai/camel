/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.jms.integration.tx;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// This test cannot run in parallel: it reads from the default DLQ and there could be more messages there
@Tags({ @Tag("not-parallel"), @Tag("transaction") })
public class JmsTransactedDeadLetterChannelNotHandlerRollbackOnExceptionIT
        extends JmsTransactedDeadLetterChannelHandlerRollbackOnExceptionIT {

    @Override
    protected boolean isHandleNew() {
        return false;
    }

    @Override
    @Test
    public void shouldNotLoseMessagesOnExceptionInErrorHandler() {
        template.sendBody(testingEndpoint, "Hello World");

        // as we do not handle new exception, then the exception propagates back
        // and causes the transaction to rollback, and we can find the message in the ActiveMQ DLQ
        Object dlqBody = consumer.receiveBody("activemq:DLQ", 2000);
        assertEquals("Hello World", dlqBody);
    }

}
