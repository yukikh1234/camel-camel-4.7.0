/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.huaweicloud.iam;

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
public class IAMEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        IAMEndpoint target = (IAMEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": target.setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "groupid":
        case "groupId": target.setGroupId(property(camelContext, java.lang.String.class, value)); return true;
        case "ignoresslverification":
        case "ignoreSslVerification": target.setIgnoreSslVerification(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxypassword":
        case "proxyPassword": target.setProxyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.setProxyPort(property(camelContext, int.class, value)); return true;
        case "proxyuser":
        case "proxyUser": target.setProxyUser(property(camelContext, java.lang.String.class, value)); return true;
        case "region": target.setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": target.setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "servicekeys":
        case "serviceKeys": target.setServiceKeys(property(camelContext, org.apache.camel.component.huaweicloud.common.models.ServiceKeys.class, value)); return true;
        case "userid":
        case "userId": target.setUserId(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return java.lang.String.class;
        case "groupid":
        case "groupId": return java.lang.String.class;
        case "ignoresslverification":
        case "ignoreSslVerification": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "proxyhost":
        case "proxyHost": return java.lang.String.class;
        case "proxypassword":
        case "proxyPassword": return java.lang.String.class;
        case "proxyport":
        case "proxyPort": return int.class;
        case "proxyuser":
        case "proxyUser": return java.lang.String.class;
        case "region": return java.lang.String.class;
        case "secretkey":
        case "secretKey": return java.lang.String.class;
        case "servicekeys":
        case "serviceKeys": return org.apache.camel.component.huaweicloud.common.models.ServiceKeys.class;
        case "userid":
        case "userId": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        IAMEndpoint target = (IAMEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return target.getAccessKey();
        case "groupid":
        case "groupId": return target.getGroupId();
        case "ignoresslverification":
        case "ignoreSslVerification": return target.isIgnoreSslVerification();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "proxyhost":
        case "proxyHost": return target.getProxyHost();
        case "proxypassword":
        case "proxyPassword": return target.getProxyPassword();
        case "proxyport":
        case "proxyPort": return target.getProxyPort();
        case "proxyuser":
        case "proxyUser": return target.getProxyUser();
        case "region": return target.getRegion();
        case "secretkey":
        case "secretKey": return target.getSecretKey();
        case "servicekeys":
        case "serviceKeys": return target.getServiceKeys();
        case "userid":
        case "userId": return target.getUserId();
        default: return null;
        }
    }
}

