/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.milvus;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.milvus.MilvusConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class MilvusConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.milvus.MilvusConfiguration target = (org.apache.camel.component.milvus.MilvusConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "client": target.setClient(property(camelContext, io.milvus.client.MilvusClient.class, value)); return true;
        case "host": target.setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "port": target.setPort(property(camelContext, int.class, value)); return true;
        case "timeout": target.setTimeout(property(camelContext, long.class, value)); return true;
        case "token": target.setToken(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "client": return io.milvus.client.MilvusClient.class;
        case "host": return java.lang.String.class;
        case "port": return int.class;
        case "timeout": return long.class;
        case "token": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.milvus.MilvusConfiguration target = (org.apache.camel.component.milvus.MilvusConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "client": return target.getClient();
        case "host": return target.getHost();
        case "port": return target.getPort();
        case "timeout": return target.getTimeout();
        case "token": return target.getToken();
        default: return null;
        }
    }
}

