/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.mllp;

import javax.annotation.processing.Generated;
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
@Generated("org.apache.camel.maven.packaging.EndpointSchemaGeneratorMojo")
@SuppressWarnings("unchecked")
public class MllpEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        MllpEndpoint target = (MllpEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accepttimeout":
        case "acceptTimeout": target.getConfiguration().setAcceptTimeout(property(camelContext, int.class, value)); return true;
        case "autoack":
        case "autoAck": target.getConfiguration().setAutoAck(property(camelContext, boolean.class, value)); return true;
        case "backlog": target.getConfiguration().setBacklog(property(camelContext, java.lang.Integer.class, value)); return true;
        case "bindretryinterval":
        case "bindRetryInterval": target.getConfiguration().setBindRetryInterval(property(camelContext, int.class, value)); return true;
        case "bindtimeout":
        case "bindTimeout": target.getConfiguration().setBindTimeout(property(camelContext, int.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.getConfiguration().setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "charsetname":
        case "charsetName": target.getConfiguration().setCharsetName(property(camelContext, java.lang.String.class, value)); return true;
        case "connecttimeout":
        case "connectTimeout": target.getConfiguration().setConnectTimeout(property(camelContext, int.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.getConfiguration().setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "hl7headers":
        case "hl7Headers": target.getConfiguration().setHl7Headers(property(camelContext, boolean.class, value)); return true;
        case "idletimeout":
        case "idleTimeout": target.getConfiguration().setIdleTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "idletimeoutstrategy":
        case "idleTimeoutStrategy": target.getConfiguration().setIdleTimeoutStrategy(property(camelContext, org.apache.camel.component.mllp.MllpIdleTimeoutStrategy.class, value)); return true;
        case "keepalive":
        case "keepAlive": target.getConfiguration().setKeepAlive(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "lenientbind":
        case "lenientBind": target.getConfiguration().setLenientBind(property(camelContext, boolean.class, value)); return true;
        case "maxbuffersize":
        case "maxBufferSize": target.getConfiguration().setMaxBufferSize(property(camelContext, int.class, value)); return true;
        case "maxconcurrentconsumers":
        case "maxConcurrentConsumers": target.getConfiguration().setMaxConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "minbuffersize":
        case "minBufferSize": target.getConfiguration().setMinBufferSize(property(camelContext, int.class, value)); return true;
        case "readtimeout":
        case "readTimeout": target.getConfiguration().setReadTimeout(property(camelContext, int.class, value)); return true;
        case "receivebuffersize":
        case "receiveBufferSize": target.getConfiguration().setReceiveBufferSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "receivetimeout":
        case "receiveTimeout": target.getConfiguration().setReceiveTimeout(property(camelContext, int.class, value)); return true;
        case "requireendofdata":
        case "requireEndOfData": target.getConfiguration().setRequireEndOfData(property(camelContext, boolean.class, value)); return true;
        case "reuseaddress":
        case "reuseAddress": target.getConfiguration().setReuseAddress(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "sendbuffersize":
        case "sendBufferSize": target.getConfiguration().setSendBufferSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "stringpayload":
        case "stringPayload": target.getConfiguration().setStringPayload(property(camelContext, boolean.class, value)); return true;
        case "tcpnodelay":
        case "tcpNoDelay": target.getConfiguration().setTcpNoDelay(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "validatepayload":
        case "validatePayload": target.getConfiguration().setValidatePayload(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accepttimeout":
        case "acceptTimeout": return int.class;
        case "autoack":
        case "autoAck": return boolean.class;
        case "backlog": return java.lang.Integer.class;
        case "bindretryinterval":
        case "bindRetryInterval": return int.class;
        case "bindtimeout":
        case "bindTimeout": return int.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "charsetname":
        case "charsetName": return java.lang.String.class;
        case "connecttimeout":
        case "connectTimeout": return int.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "hl7headers":
        case "hl7Headers": return boolean.class;
        case "idletimeout":
        case "idleTimeout": return java.lang.Integer.class;
        case "idletimeoutstrategy":
        case "idleTimeoutStrategy": return org.apache.camel.component.mllp.MllpIdleTimeoutStrategy.class;
        case "keepalive":
        case "keepAlive": return java.lang.Boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "lenientbind":
        case "lenientBind": return boolean.class;
        case "maxbuffersize":
        case "maxBufferSize": return int.class;
        case "maxconcurrentconsumers":
        case "maxConcurrentConsumers": return int.class;
        case "minbuffersize":
        case "minBufferSize": return int.class;
        case "readtimeout":
        case "readTimeout": return int.class;
        case "receivebuffersize":
        case "receiveBufferSize": return java.lang.Integer.class;
        case "receivetimeout":
        case "receiveTimeout": return int.class;
        case "requireendofdata":
        case "requireEndOfData": return boolean.class;
        case "reuseaddress":
        case "reuseAddress": return java.lang.Boolean.class;
        case "sendbuffersize":
        case "sendBufferSize": return java.lang.Integer.class;
        case "stringpayload":
        case "stringPayload": return boolean.class;
        case "tcpnodelay":
        case "tcpNoDelay": return java.lang.Boolean.class;
        case "validatepayload":
        case "validatePayload": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        MllpEndpoint target = (MllpEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accepttimeout":
        case "acceptTimeout": return target.getConfiguration().getAcceptTimeout();
        case "autoack":
        case "autoAck": return target.getConfiguration().isAutoAck();
        case "backlog": return target.getConfiguration().getBacklog();
        case "bindretryinterval":
        case "bindRetryInterval": return target.getConfiguration().getBindRetryInterval();
        case "bindtimeout":
        case "bindTimeout": return target.getConfiguration().getBindTimeout();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.getConfiguration().isBridgeErrorHandler();
        case "charsetname":
        case "charsetName": return target.getConfiguration().getCharsetName();
        case "connecttimeout":
        case "connectTimeout": return target.getConfiguration().getConnectTimeout();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getConfiguration().getExchangePattern();
        case "hl7headers":
        case "hl7Headers": return target.getConfiguration().isHl7Headers();
        case "idletimeout":
        case "idleTimeout": return target.getConfiguration().getIdleTimeout();
        case "idletimeoutstrategy":
        case "idleTimeoutStrategy": return target.getConfiguration().getIdleTimeoutStrategy();
        case "keepalive":
        case "keepAlive": return target.getConfiguration().getKeepAlive();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "lenientbind":
        case "lenientBind": return target.getConfiguration().isLenientBind();
        case "maxbuffersize":
        case "maxBufferSize": return target.getConfiguration().getMaxBufferSize();
        case "maxconcurrentconsumers":
        case "maxConcurrentConsumers": return target.getConfiguration().getMaxConcurrentConsumers();
        case "minbuffersize":
        case "minBufferSize": return target.getConfiguration().getMinBufferSize();
        case "readtimeout":
        case "readTimeout": return target.getConfiguration().getReadTimeout();
        case "receivebuffersize":
        case "receiveBufferSize": return target.getConfiguration().getReceiveBufferSize();
        case "receivetimeout":
        case "receiveTimeout": return target.getConfiguration().getReceiveTimeout();
        case "requireendofdata":
        case "requireEndOfData": return target.getConfiguration().isRequireEndOfData();
        case "reuseaddress":
        case "reuseAddress": return target.getConfiguration().getReuseAddress();
        case "sendbuffersize":
        case "sendBufferSize": return target.getConfiguration().getSendBufferSize();
        case "stringpayload":
        case "stringPayload": return target.getConfiguration().isStringPayload();
        case "tcpnodelay":
        case "tcpNoDelay": return target.getConfiguration().getTcpNoDelay();
        case "validatepayload":
        case "validatePayload": return target.getConfiguration().isValidatePayload();
        default: return null;
        }
    }
}

