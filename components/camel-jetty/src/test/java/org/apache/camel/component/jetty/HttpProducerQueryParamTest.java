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
package org.apache.camel.component.jetty;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HttpProducerQueryParamTest extends BaseJettyTest {

    private final String url = "http://127.0.0.1:" + getPort() + "/cheese";

    @Test
    public void testQueryParameters() {
        Exchange exchange = template.request(url + "?quote=Camel%20rocks", null);
        assertNotNull(exchange);

        String body = exchange.getMessage().getBody(String.class);
        Map<?, ?> headers = exchange.getMessage().getHeaders();

        assertEquals("Bye World", body);
        assertEquals("Carlsberg", headers.get("beer"));
    }

    @Test
    public void testQueryParametersWithHeader() {
        Exchange exchange = template.request(url, new Processor() {
            public void process(Exchange exchange) {
                exchange.getIn().setHeader(Exchange.HTTP_QUERY, "quote=Camel rocks");
            }
        });
        assertNotNull(exchange);

        String body = exchange.getMessage().getBody(String.class);
        Map<?, ?> headers = exchange.getMessage().getHeaders();

        assertEquals("Bye World", body);
        assertEquals("Carlsberg", headers.get("beer"));
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from("jetty:" + url).process(new Processor() {
                    public void process(Exchange exchange) {
                        String quote = exchange.getIn().getHeader("quote", String.class);
                        assertEquals("Camel rocks", quote);

                        exchange.getMessage().setBody("Bye World");
                        exchange.getMessage().setHeader("beer", "Carlsberg");
                    }
                });
            }
        };
    }
}
