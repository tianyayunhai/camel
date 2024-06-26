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
package org.apache.camel.component.bean;

import org.apache.camel.Body;
import org.apache.camel.ContextTestSupport;
import org.apache.camel.Exchange;
import org.apache.camel.Header;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.spi.Registry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test to demonstrate annotations combined with Exchange parameter.
 */
public class BeanWithAnnotationAndExchangeTest extends ContextTestSupport {

    @Test
    public void testBeanWithAnnotationAndExchangeTest() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedBodiesReceived("StartMyBean");
        mock.expectedHeaderReceived("user", "admin");

        template.requestBody("direct:in", "Start");

        mock.assertIsSatisfied();
    }

    @Override
    protected Registry createCamelRegistry() throws Exception {
        Registry answer = super.createCamelRegistry();
        answer.bind("myBean", new MyBean());
        return answer;
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            public void configure() throws Exception {
                from("direct:in").setHeader("user", constant("admin")).to("bean:myBean").to("mock:result");
            }
        };
    }

    public static class MyBean {

        // START SNIPPET: e1
        public void doSomething(@Header("user") String user, @Body String body, Exchange exchange) {
            assertEquals("admin", user);

            exchange.getIn().setBody(body + "MyBean");
        }
        // END SNIPPET: e1
    }

}
