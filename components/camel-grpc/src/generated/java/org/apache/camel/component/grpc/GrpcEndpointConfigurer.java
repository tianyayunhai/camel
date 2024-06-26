/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.grpc;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class GrpcEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        GrpcEndpoint target = (GrpcEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authenticationtype":
        case "authenticationType": target.getConfiguration().setAuthenticationType(property(camelContext, org.apache.camel.component.grpc.GrpcAuthType.class, value)); return true;
        case "autodiscoverclientinterceptors":
        case "autoDiscoverClientInterceptors": target.getConfiguration().setAutoDiscoverClientInterceptors(property(camelContext, boolean.class, value)); return true;
        case "autodiscoverserverinterceptors":
        case "autoDiscoverServerInterceptors": target.getConfiguration().setAutoDiscoverServerInterceptors(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "consumerstrategy":
        case "consumerStrategy": target.getConfiguration().setConsumerStrategy(property(camelContext, org.apache.camel.component.grpc.GrpcConsumerStrategy.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "flowcontrolwindow":
        case "flowControlWindow": target.getConfiguration().setFlowControlWindow(property(camelContext, int.class, value)); return true;
        case "forwardoncompleted":
        case "forwardOnCompleted": target.getConfiguration().setForwardOnCompleted(property(camelContext, boolean.class, value)); return true;
        case "forwardonerror":
        case "forwardOnError": target.getConfiguration().setForwardOnError(property(camelContext, boolean.class, value)); return true;
        case "inheritexchangepropertiesforreplies":
        case "inheritExchangePropertiesForReplies": target.getConfiguration().setInheritExchangePropertiesForReplies(property(camelContext, boolean.class, value)); return true;
        case "jwtalgorithm":
        case "jwtAlgorithm": target.getConfiguration().setJwtAlgorithm(property(camelContext, org.apache.camel.component.grpc.auth.jwt.JwtAlgorithm.class, value)); return true;
        case "jwtissuer":
        case "jwtIssuer": target.getConfiguration().setJwtIssuer(property(camelContext, java.lang.String.class, value)); return true;
        case "jwtsecret":
        case "jwtSecret": target.getConfiguration().setJwtSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "jwtsubject":
        case "jwtSubject": target.getConfiguration().setJwtSubject(property(camelContext, java.lang.String.class, value)); return true;
        case "keycertchainresource":
        case "keyCertChainResource": target.getConfiguration().setKeyCertChainResource(property(camelContext, java.lang.String.class, value)); return true;
        case "keypassword":
        case "keyPassword": target.getConfiguration().setKeyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "keyresource":
        case "keyResource": target.getConfiguration().setKeyResource(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxconcurrentcallsperconnection":
        case "maxConcurrentCallsPerConnection": target.getConfiguration().setMaxConcurrentCallsPerConnection(property(camelContext, int.class, value)); return true;
        case "maxmessagesize":
        case "maxMessageSize": target.getConfiguration().setMaxMessageSize(property(camelContext, int.class, value)); return true;
        case "method": target.getConfiguration().setMethod(property(camelContext, java.lang.String.class, value)); return true;
        case "negotiationtype":
        case "negotiationType": target.getConfiguration().setNegotiationType(property(camelContext, io.grpc.netty.NegotiationType.class, value)); return true;
        case "producerstrategy":
        case "producerStrategy": target.getConfiguration().setProducerStrategy(property(camelContext, org.apache.camel.component.grpc.GrpcProducerStrategy.class, value)); return true;
        case "routecontrolledstreamobserver":
        case "routeControlledStreamObserver": target.getConfiguration().setRouteControlledStreamObserver(property(camelContext, boolean.class, value)); return true;
        case "serviceaccountresource":
        case "serviceAccountResource": target.getConfiguration().setServiceAccountResource(property(camelContext, java.lang.String.class, value)); return true;
        case "streamrepliesto":
        case "streamRepliesTo": target.getConfiguration().setStreamRepliesTo(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.getConfiguration().setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "toroutecontrolledstreamobserver":
        case "toRouteControlledStreamObserver": target.getConfiguration().setToRouteControlledStreamObserver(property(camelContext, boolean.class, value)); return true;
        case "trustcertcollectionresource":
        case "trustCertCollectionResource": target.getConfiguration().setTrustCertCollectionResource(property(camelContext, java.lang.String.class, value)); return true;
        case "useragent":
        case "userAgent": target.getConfiguration().setUserAgent(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authenticationtype":
        case "authenticationType": return org.apache.camel.component.grpc.GrpcAuthType.class;
        case "autodiscoverclientinterceptors":
        case "autoDiscoverClientInterceptors": return boolean.class;
        case "autodiscoverserverinterceptors":
        case "autoDiscoverServerInterceptors": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "consumerstrategy":
        case "consumerStrategy": return org.apache.camel.component.grpc.GrpcConsumerStrategy.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "flowcontrolwindow":
        case "flowControlWindow": return int.class;
        case "forwardoncompleted":
        case "forwardOnCompleted": return boolean.class;
        case "forwardonerror":
        case "forwardOnError": return boolean.class;
        case "inheritexchangepropertiesforreplies":
        case "inheritExchangePropertiesForReplies": return boolean.class;
        case "jwtalgorithm":
        case "jwtAlgorithm": return org.apache.camel.component.grpc.auth.jwt.JwtAlgorithm.class;
        case "jwtissuer":
        case "jwtIssuer": return java.lang.String.class;
        case "jwtsecret":
        case "jwtSecret": return java.lang.String.class;
        case "jwtsubject":
        case "jwtSubject": return java.lang.String.class;
        case "keycertchainresource":
        case "keyCertChainResource": return java.lang.String.class;
        case "keypassword":
        case "keyPassword": return java.lang.String.class;
        case "keyresource":
        case "keyResource": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "maxconcurrentcallsperconnection":
        case "maxConcurrentCallsPerConnection": return int.class;
        case "maxmessagesize":
        case "maxMessageSize": return int.class;
        case "method": return java.lang.String.class;
        case "negotiationtype":
        case "negotiationType": return io.grpc.netty.NegotiationType.class;
        case "producerstrategy":
        case "producerStrategy": return org.apache.camel.component.grpc.GrpcProducerStrategy.class;
        case "routecontrolledstreamobserver":
        case "routeControlledStreamObserver": return boolean.class;
        case "serviceaccountresource":
        case "serviceAccountResource": return java.lang.String.class;
        case "streamrepliesto":
        case "streamRepliesTo": return java.lang.String.class;
        case "synchronous": return boolean.class;
        case "toroutecontrolledstreamobserver":
        case "toRouteControlledStreamObserver": return boolean.class;
        case "trustcertcollectionresource":
        case "trustCertCollectionResource": return java.lang.String.class;
        case "useragent":
        case "userAgent": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        GrpcEndpoint target = (GrpcEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authenticationtype":
        case "authenticationType": return target.getConfiguration().getAuthenticationType();
        case "autodiscoverclientinterceptors":
        case "autoDiscoverClientInterceptors": return target.getConfiguration().isAutoDiscoverClientInterceptors();
        case "autodiscoverserverinterceptors":
        case "autoDiscoverServerInterceptors": return target.getConfiguration().isAutoDiscoverServerInterceptors();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "consumerstrategy":
        case "consumerStrategy": return target.getConfiguration().getConsumerStrategy();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "flowcontrolwindow":
        case "flowControlWindow": return target.getConfiguration().getFlowControlWindow();
        case "forwardoncompleted":
        case "forwardOnCompleted": return target.getConfiguration().isForwardOnCompleted();
        case "forwardonerror":
        case "forwardOnError": return target.getConfiguration().isForwardOnError();
        case "inheritexchangepropertiesforreplies":
        case "inheritExchangePropertiesForReplies": return target.getConfiguration().isInheritExchangePropertiesForReplies();
        case "jwtalgorithm":
        case "jwtAlgorithm": return target.getConfiguration().getJwtAlgorithm();
        case "jwtissuer":
        case "jwtIssuer": return target.getConfiguration().getJwtIssuer();
        case "jwtsecret":
        case "jwtSecret": return target.getConfiguration().getJwtSecret();
        case "jwtsubject":
        case "jwtSubject": return target.getConfiguration().getJwtSubject();
        case "keycertchainresource":
        case "keyCertChainResource": return target.getConfiguration().getKeyCertChainResource();
        case "keypassword":
        case "keyPassword": return target.getConfiguration().getKeyPassword();
        case "keyresource":
        case "keyResource": return target.getConfiguration().getKeyResource();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxconcurrentcallsperconnection":
        case "maxConcurrentCallsPerConnection": return target.getConfiguration().getMaxConcurrentCallsPerConnection();
        case "maxmessagesize":
        case "maxMessageSize": return target.getConfiguration().getMaxMessageSize();
        case "method": return target.getConfiguration().getMethod();
        case "negotiationtype":
        case "negotiationType": return target.getConfiguration().getNegotiationType();
        case "producerstrategy":
        case "producerStrategy": return target.getConfiguration().getProducerStrategy();
        case "routecontrolledstreamobserver":
        case "routeControlledStreamObserver": return target.getConfiguration().isRouteControlledStreamObserver();
        case "serviceaccountresource":
        case "serviceAccountResource": return target.getConfiguration().getServiceAccountResource();
        case "streamrepliesto":
        case "streamRepliesTo": return target.getConfiguration().getStreamRepliesTo();
        case "synchronous": return target.getConfiguration().isSynchronous();
        case "toroutecontrolledstreamobserver":
        case "toRouteControlledStreamObserver": return target.getConfiguration().isToRouteControlledStreamObserver();
        case "trustcertcollectionresource":
        case "trustCertCollectionResource": return target.getConfiguration().getTrustCertCollectionResource();
        case "useragent":
        case "userAgent": return target.getConfiguration().getUserAgent();
        default: return null;
        }
    }
}

