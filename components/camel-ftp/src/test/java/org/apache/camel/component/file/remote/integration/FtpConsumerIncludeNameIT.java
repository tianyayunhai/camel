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
package org.apache.camel.component.file.remote.integration;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.junit.jupiter.api.Test;

/**
 * Unit test that ftp consumer will include pre and postfixes
 */
public class FtpConsumerIncludeNameIT extends FtpServerTestSupport {

    private String getFtpUrl() {
        return "ftp://admin@localhost:{{ftp.server.port}}/includename?password=admin" + "&include=report.*&exclude=.*xml";
    }

    @Override
    public void doPostSetup() throws Exception {
        prepareFtpServer();
    }

    @Test
    public void testIncludeAndExludePreAndPostfixes() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedMessageCount(1);
        mock.expectedBodiesReceived("Report 1");
        mock.assertIsSatisfied();
    }

    private void prepareFtpServer() {
        // prepares the FTP Server by creating files on the server that we want
        // to unit
        // test that we can pool and store as a local file
        sendFile(getFtpUrl(), "Hello World", "hello.xml");
        sendFile(getFtpUrl(), "Report 1", "report1.txt");
        sendFile(getFtpUrl(), "Bye World", "secret.txt");
        sendFile(getFtpUrl(), "Report 2", "report2.xml");
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                from(getFtpUrl()).to("mock:result");
            }
        };
    }
}
