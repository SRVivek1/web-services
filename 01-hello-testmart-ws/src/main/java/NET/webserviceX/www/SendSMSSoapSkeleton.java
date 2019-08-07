/**
 * SendSMSSoapSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NET.webserviceX.www;

public class SendSMSSoapSkeleton implements NET.webserviceX.www.SendSMSSoap, org.apache.axis.wsdl.Skeleton {
    private NET.webserviceX.www.SendSMSSoap impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.webserviceX.NET", "MobileNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.webserviceX.NET", "FromEmailAddress"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.webserviceX.NET", "Message"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("sendSMSToIndia", _params, new javax.xml.namespace.QName("http://www.webserviceX.NET", "SendSMSToIndiaResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.webserviceX.NET", "SMSResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.webserviceX.NET", "SendSMSToIndia"));
        _oper.setSoapAction("http://www.webserviceX.NET/SendSMSToIndia");
        _myOperationsList.add(_oper);
        if (_myOperations.get("sendSMSToIndia") == null) {
            _myOperations.put("sendSMSToIndia", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("sendSMSToIndia")).add(_oper);
    }

    public SendSMSSoapSkeleton() {
        this.impl = new NET.webserviceX.www.SendSMSSoapImpl();
    }

    public SendSMSSoapSkeleton(NET.webserviceX.www.SendSMSSoap impl) {
        this.impl = impl;
    }
    public NET.webserviceX.www.SMSResult sendSMSToIndia(java.lang.String mobileNumber, java.lang.String fromEmailAddress, java.lang.String message) throws java.rmi.RemoteException
    {
        NET.webserviceX.www.SMSResult ret = impl.sendSMSToIndia(mobileNumber, fromEmailAddress, message);
        return ret;
    }

}
