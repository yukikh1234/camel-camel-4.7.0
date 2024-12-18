/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.mail;

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
public class MailComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.mail.MailConfiguration getOrCreateConfiguration(MailComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.mail.MailConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        MailComponent target = (MailComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionaljavamailproperties":
        case "additionalJavaMailProperties": getOrCreateConfiguration(target).setAdditionalJavaMailProperties(property(camelContext, java.util.Properties.class, value)); return true;
        case "alternativebodyheader":
        case "alternativeBodyHeader": getOrCreateConfiguration(target).setAlternativeBodyHeader(property(camelContext, java.lang.String.class, value)); return true;
        case "attachmentscontenttransferencodingresolver":
        case "attachmentsContentTransferEncodingResolver": getOrCreateConfiguration(target).setAttachmentsContentTransferEncodingResolver(property(camelContext, org.apache.camel.component.mail.AttachmentsContentTransferEncodingResolver.class, value)); return true;
        case "authenticator": getOrCreateConfiguration(target).setAuthenticator(property(camelContext, org.apache.camel.component.mail.MailAuthenticator.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "bcc": getOrCreateConfiguration(target).setBcc(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "cc": getOrCreateConfiguration(target).setCc(property(camelContext, java.lang.String.class, value)); return true;
        case "closefolder":
        case "closeFolder": getOrCreateConfiguration(target).setCloseFolder(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.mail.MailConfiguration.class, value)); return true;
        case "connectiontimeout":
        case "connectionTimeout": getOrCreateConfiguration(target).setConnectionTimeout(property(camelContext, int.class, value)); return true;
        case "contenttype":
        case "contentType": getOrCreateConfiguration(target).setContentType(property(camelContext, java.lang.String.class, value)); return true;
        case "contenttyperesolver":
        case "contentTypeResolver": target.setContentTypeResolver(property(camelContext, org.apache.camel.component.mail.ContentTypeResolver.class, value)); return true;
        case "copyto":
        case "copyTo": getOrCreateConfiguration(target).setCopyTo(property(camelContext, java.lang.String.class, value)); return true;
        case "debugmode":
        case "debugMode": getOrCreateConfiguration(target).setDebugMode(property(camelContext, boolean.class, value)); return true;
        case "decodefilename":
        case "decodeFilename": getOrCreateConfiguration(target).setDecodeFilename(property(camelContext, boolean.class, value)); return true;
        case "delete": getOrCreateConfiguration(target).setDelete(property(camelContext, boolean.class, value)); return true;
        case "disconnect": getOrCreateConfiguration(target).setDisconnect(property(camelContext, boolean.class, value)); return true;
        case "failonduplicatefileattachment":
        case "failOnDuplicateFileAttachment": getOrCreateConfiguration(target).setFailOnDuplicateFileAttachment(property(camelContext, boolean.class, value)); return true;
        case "fetchsize":
        case "fetchSize": getOrCreateConfiguration(target).setFetchSize(property(camelContext, int.class, value)); return true;
        case "foldername":
        case "folderName": getOrCreateConfiguration(target).setFolderName(property(camelContext, java.lang.String.class, value)); return true;
        case "from": getOrCreateConfiguration(target).setFrom(property(camelContext, java.lang.String.class, value)); return true;
        case "generatemissingattachmentnames":
        case "generateMissingAttachmentNames": getOrCreateConfiguration(target).setGenerateMissingAttachmentNames(property(camelContext, java.lang.String.class, value)); return true;
        case "handleduplicateattachmentnames":
        case "handleDuplicateAttachmentNames": getOrCreateConfiguration(target).setHandleDuplicateAttachmentNames(property(camelContext, java.lang.String.class, value)); return true;
        case "handlefailedmessage":
        case "handleFailedMessage": getOrCreateConfiguration(target).setHandleFailedMessage(property(camelContext, boolean.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "healthcheckconsumerenabled":
        case "healthCheckConsumerEnabled": target.setHealthCheckConsumerEnabled(property(camelContext, boolean.class, value)); return true;
        case "healthcheckproducerenabled":
        case "healthCheckProducerEnabled": target.setHealthCheckProducerEnabled(property(camelContext, boolean.class, value)); return true;
        case "ignoreunsupportedcharset":
        case "ignoreUnsupportedCharset": getOrCreateConfiguration(target).setIgnoreUnsupportedCharset(property(camelContext, boolean.class, value)); return true;
        case "ignoreurischeme":
        case "ignoreUriScheme": getOrCreateConfiguration(target).setIgnoreUriScheme(property(camelContext, boolean.class, value)); return true;
        case "javamailproperties":
        case "javaMailProperties": getOrCreateConfiguration(target).setJavaMailProperties(property(camelContext, java.util.Properties.class, value)); return true;
        case "javamailsender":
        case "javaMailSender": getOrCreateConfiguration(target).setJavaMailSender(property(camelContext, org.apache.camel.component.mail.JavaMailSender.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "mapmailmessage":
        case "mapMailMessage": getOrCreateConfiguration(target).setMapMailMessage(property(camelContext, boolean.class, value)); return true;
        case "mimedecodeheaders":
        case "mimeDecodeHeaders": getOrCreateConfiguration(target).setMimeDecodeHeaders(property(camelContext, boolean.class, value)); return true;
        case "moveto":
        case "moveTo": getOrCreateConfiguration(target).setMoveTo(property(camelContext, java.lang.String.class, value)); return true;
        case "password": getOrCreateConfiguration(target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "peek": getOrCreateConfiguration(target).setPeek(property(camelContext, boolean.class, value)); return true;
        case "replyto":
        case "replyTo": getOrCreateConfiguration(target).setReplyTo(property(camelContext, java.lang.String.class, value)); return true;
        case "session": getOrCreateConfiguration(target).setSession(property(camelContext, jakarta.mail.Session.class, value)); return true;
        case "skipfailedmessage":
        case "skipFailedMessage": getOrCreateConfiguration(target).setSkipFailedMessage(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": getOrCreateConfiguration(target).setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "subject": getOrCreateConfiguration(target).setSubject(property(camelContext, java.lang.String.class, value)); return true;
        case "to": getOrCreateConfiguration(target).setTo(property(camelContext, java.lang.String.class, value)); return true;
        case "unseen": getOrCreateConfiguration(target).setUnseen(property(camelContext, boolean.class, value)); return true;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        case "useinlineattachments":
        case "useInlineAttachments": getOrCreateConfiguration(target).setUseInlineAttachments(property(camelContext, boolean.class, value)); return true;
        case "username": getOrCreateConfiguration(target).setUsername(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionaljavamailproperties":
        case "additionalJavaMailProperties": return java.util.Properties.class;
        case "alternativebodyheader":
        case "alternativeBodyHeader": return java.lang.String.class;
        case "attachmentscontenttransferencodingresolver":
        case "attachmentsContentTransferEncodingResolver": return org.apache.camel.component.mail.AttachmentsContentTransferEncodingResolver.class;
        case "authenticator": return org.apache.camel.component.mail.MailAuthenticator.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "bcc": return java.lang.String.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "cc": return java.lang.String.class;
        case "closefolder":
        case "closeFolder": return boolean.class;
        case "configuration": return org.apache.camel.component.mail.MailConfiguration.class;
        case "connectiontimeout":
        case "connectionTimeout": return int.class;
        case "contenttype":
        case "contentType": return java.lang.String.class;
        case "contenttyperesolver":
        case "contentTypeResolver": return org.apache.camel.component.mail.ContentTypeResolver.class;
        case "copyto":
        case "copyTo": return java.lang.String.class;
        case "debugmode":
        case "debugMode": return boolean.class;
        case "decodefilename":
        case "decodeFilename": return boolean.class;
        case "delete": return boolean.class;
        case "disconnect": return boolean.class;
        case "failonduplicatefileattachment":
        case "failOnDuplicateFileAttachment": return boolean.class;
        case "fetchsize":
        case "fetchSize": return int.class;
        case "foldername":
        case "folderName": return java.lang.String.class;
        case "from": return java.lang.String.class;
        case "generatemissingattachmentnames":
        case "generateMissingAttachmentNames": return java.lang.String.class;
        case "handleduplicateattachmentnames":
        case "handleDuplicateAttachmentNames": return java.lang.String.class;
        case "handlefailedmessage":
        case "handleFailedMessage": return boolean.class;
        case "headerfilterstrategy":
        case "headerFilterStrategy": return org.apache.camel.spi.HeaderFilterStrategy.class;
        case "healthcheckconsumerenabled":
        case "healthCheckConsumerEnabled": return boolean.class;
        case "healthcheckproducerenabled":
        case "healthCheckProducerEnabled": return boolean.class;
        case "ignoreunsupportedcharset":
        case "ignoreUnsupportedCharset": return boolean.class;
        case "ignoreurischeme":
        case "ignoreUriScheme": return boolean.class;
        case "javamailproperties":
        case "javaMailProperties": return java.util.Properties.class;
        case "javamailsender":
        case "javaMailSender": return org.apache.camel.component.mail.JavaMailSender.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "mapmailmessage":
        case "mapMailMessage": return boolean.class;
        case "mimedecodeheaders":
        case "mimeDecodeHeaders": return boolean.class;
        case "moveto":
        case "moveTo": return java.lang.String.class;
        case "password": return java.lang.String.class;
        case "peek": return boolean.class;
        case "replyto":
        case "replyTo": return java.lang.String.class;
        case "session": return jakarta.mail.Session.class;
        case "skipfailedmessage":
        case "skipFailedMessage": return boolean.class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "subject": return java.lang.String.class;
        case "to": return java.lang.String.class;
        case "unseen": return boolean.class;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": return boolean.class;
        case "useinlineattachments":
        case "useInlineAttachments": return boolean.class;
        case "username": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        MailComponent target = (MailComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionaljavamailproperties":
        case "additionalJavaMailProperties": return getOrCreateConfiguration(target).getAdditionalJavaMailProperties();
        case "alternativebodyheader":
        case "alternativeBodyHeader": return getOrCreateConfiguration(target).getAlternativeBodyHeader();
        case "attachmentscontenttransferencodingresolver":
        case "attachmentsContentTransferEncodingResolver": return getOrCreateConfiguration(target).getAttachmentsContentTransferEncodingResolver();
        case "authenticator": return getOrCreateConfiguration(target).getAuthenticator();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "bcc": return getOrCreateConfiguration(target).getBcc();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "cc": return getOrCreateConfiguration(target).getCc();
        case "closefolder":
        case "closeFolder": return getOrCreateConfiguration(target).isCloseFolder();
        case "configuration": return target.getConfiguration();
        case "connectiontimeout":
        case "connectionTimeout": return getOrCreateConfiguration(target).getConnectionTimeout();
        case "contenttype":
        case "contentType": return getOrCreateConfiguration(target).getContentType();
        case "contenttyperesolver":
        case "contentTypeResolver": return target.getContentTypeResolver();
        case "copyto":
        case "copyTo": return getOrCreateConfiguration(target).getCopyTo();
        case "debugmode":
        case "debugMode": return getOrCreateConfiguration(target).isDebugMode();
        case "decodefilename":
        case "decodeFilename": return getOrCreateConfiguration(target).isDecodeFilename();
        case "delete": return getOrCreateConfiguration(target).isDelete();
        case "disconnect": return getOrCreateConfiguration(target).isDisconnect();
        case "failonduplicatefileattachment":
        case "failOnDuplicateFileAttachment": return getOrCreateConfiguration(target).isFailOnDuplicateFileAttachment();
        case "fetchsize":
        case "fetchSize": return getOrCreateConfiguration(target).getFetchSize();
        case "foldername":
        case "folderName": return getOrCreateConfiguration(target).getFolderName();
        case "from": return getOrCreateConfiguration(target).getFrom();
        case "generatemissingattachmentnames":
        case "generateMissingAttachmentNames": return getOrCreateConfiguration(target).getGenerateMissingAttachmentNames();
        case "handleduplicateattachmentnames":
        case "handleDuplicateAttachmentNames": return getOrCreateConfiguration(target).getHandleDuplicateAttachmentNames();
        case "handlefailedmessage":
        case "handleFailedMessage": return getOrCreateConfiguration(target).isHandleFailedMessage();
        case "headerfilterstrategy":
        case "headerFilterStrategy": return target.getHeaderFilterStrategy();
        case "healthcheckconsumerenabled":
        case "healthCheckConsumerEnabled": return target.isHealthCheckConsumerEnabled();
        case "healthcheckproducerenabled":
        case "healthCheckProducerEnabled": return target.isHealthCheckProducerEnabled();
        case "ignoreunsupportedcharset":
        case "ignoreUnsupportedCharset": return getOrCreateConfiguration(target).isIgnoreUnsupportedCharset();
        case "ignoreurischeme":
        case "ignoreUriScheme": return getOrCreateConfiguration(target).isIgnoreUriScheme();
        case "javamailproperties":
        case "javaMailProperties": return getOrCreateConfiguration(target).getJavaMailProperties();
        case "javamailsender":
        case "javaMailSender": return getOrCreateConfiguration(target).getJavaMailSender();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "mapmailmessage":
        case "mapMailMessage": return getOrCreateConfiguration(target).isMapMailMessage();
        case "mimedecodeheaders":
        case "mimeDecodeHeaders": return getOrCreateConfiguration(target).isMimeDecodeHeaders();
        case "moveto":
        case "moveTo": return getOrCreateConfiguration(target).getMoveTo();
        case "password": return getOrCreateConfiguration(target).getPassword();
        case "peek": return getOrCreateConfiguration(target).isPeek();
        case "replyto":
        case "replyTo": return getOrCreateConfiguration(target).getReplyTo();
        case "session": return getOrCreateConfiguration(target).getSession();
        case "skipfailedmessage":
        case "skipFailedMessage": return getOrCreateConfiguration(target).isSkipFailedMessage();
        case "sslcontextparameters":
        case "sslContextParameters": return getOrCreateConfiguration(target).getSslContextParameters();
        case "subject": return getOrCreateConfiguration(target).getSubject();
        case "to": return getOrCreateConfiguration(target).getTo();
        case "unseen": return getOrCreateConfiguration(target).isUnseen();
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": return target.isUseGlobalSslContextParameters();
        case "useinlineattachments":
        case "useInlineAttachments": return getOrCreateConfiguration(target).isUseInlineAttachments();
        case "username": return getOrCreateConfiguration(target).getUsername();
        default: return null;
        }
    }
}

