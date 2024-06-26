/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.dhis2;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.dhis2.Dhis2Configuration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class Dhis2ConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.dhis2.Dhis2Configuration target = (org.apache.camel.component.dhis2.Dhis2Configuration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "apiName": target.setApiName(property(camelContext, org.apache.camel.component.dhis2.internal.Dhis2ApiName.class, value)); return true;
        case "baseapiurl":
        case "baseApiUrl": target.setBaseApiUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "client": target.setClient(property(camelContext, org.hisp.dhis.integration.sdk.api.Dhis2Client.class, value)); return true;
        case "methodname":
        case "methodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "personalaccesstoken":
        case "personalAccessToken": target.setPersonalAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "username": target.setUsername(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "apiName": return org.apache.camel.component.dhis2.internal.Dhis2ApiName.class;
        case "baseapiurl":
        case "baseApiUrl": return java.lang.String.class;
        case "client": return org.hisp.dhis.integration.sdk.api.Dhis2Client.class;
        case "methodname":
        case "methodName": return java.lang.String.class;
        case "password": return java.lang.String.class;
        case "personalaccesstoken":
        case "personalAccessToken": return java.lang.String.class;
        case "username": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.dhis2.Dhis2Configuration target = (org.apache.camel.component.dhis2.Dhis2Configuration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "apiName": return target.getApiName();
        case "baseapiurl":
        case "baseApiUrl": return target.getBaseApiUrl();
        case "client": return target.getClient();
        case "methodname":
        case "methodName": return target.getMethodName();
        case "password": return target.getPassword();
        case "personalaccesstoken":
        case "personalAccessToken": return target.getPersonalAccessToken();
        case "username": return target.getUsername();
        default: return null;
        }
    }
}

