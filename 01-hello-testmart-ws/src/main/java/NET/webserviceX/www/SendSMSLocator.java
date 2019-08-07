/**
 * SendSMSLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NET.webserviceX.www;

public class SendSMSLocator extends org.apache.axis.client.Service implements NET.webserviceX.www.SendSMS {

    public SendSMSLocator() {
    }


    public SendSMSLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SendSMSLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SendSMSSoap
    private java.lang.String SendSMSSoap_address = "http://www.webservicex.net/SendSMS.asmx";

    public java.lang.String getSendSMSSoapAddress() {
        return SendSMSSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SendSMSSoapWSDDServiceName = "SendSMSSoap";

    public java.lang.String getSendSMSSoapWSDDServiceName() {
        return SendSMSSoapWSDDServiceName;
    }

    public void setSendSMSSoapWSDDServiceName(java.lang.String name) {
        SendSMSSoapWSDDServiceName = name;
    }

    public NET.webserviceX.www.SendSMSSoap getSendSMSSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SendSMSSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSendSMSSoap(endpoint);
    }

    public NET.webserviceX.www.SendSMSSoap getSendSMSSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            NET.webserviceX.www.SendSMSSoapStub _stub = new NET.webserviceX.www.SendSMSSoapStub(portAddress, this);
            _stub.setPortName(getSendSMSSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSendSMSSoapEndpointAddress(java.lang.String address) {
        SendSMSSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (NET.webserviceX.www.SendSMSSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                NET.webserviceX.www.SendSMSSoapStub _stub = new NET.webserviceX.www.SendSMSSoapStub(new java.net.URL(SendSMSSoap_address), this);
                _stub.setPortName(getSendSMSSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SendSMSSoap".equals(inputPortName)) {
            return getSendSMSSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.webserviceX.NET", "SendSMS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.webserviceX.NET", "SendSMSSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SendSMSSoap".equals(portName)) {
            setSendSMSSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
