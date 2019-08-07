/**
 * HelloWorldService_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.helloworld.HelloWorldService;

public interface HelloWorldService_Service extends javax.xml.rpc.Service {
    public java.lang.String getHelloWorldServicePortAddress();

    public com.helloworld.HelloWorldService.HelloWorldService_PortType getHelloWorldServicePort() throws javax.xml.rpc.ServiceException;

    public com.helloworld.HelloWorldService.HelloWorldService_PortType getHelloWorldServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
