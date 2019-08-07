/**
 * HelloWorldBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rpsoft.www.helloworld.greeting;

public class HelloWorldBindingSkeleton implements com.rpsoft.www.helloworld.greeting.HelloWorld, org.apache.axis.wsdl.Skeleton {
    private com.rpsoft.www.helloworld.greeting.HelloWorld impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.rpsoft.com/helloworld/greeting/", "SayHelloRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("sayHello", _params, new javax.xml.namespace.QName("http://www.rpsoft.com/helloworld/greeting/", "SayHelloResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "sayHello"));
        _myOperationsList.add(_oper);
        if (_myOperations.get("sayHello") == null) {
            _myOperations.put("sayHello", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("sayHello")).add(_oper);
    }

    public HelloWorldBindingSkeleton() {
        this.impl = new com.rpsoft.www.helloworld.greeting.HelloWorldBindingImpl();
    }

    public HelloWorldBindingSkeleton(com.rpsoft.www.helloworld.greeting.HelloWorld impl) {
        this.impl = impl;
    }
    public java.lang.String sayHello(java.lang.String userName) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.sayHello(userName);
        return ret;
    }

}
