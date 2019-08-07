package com.helloworld.HelloWorldService;

public class HelloWorldServiceProxy implements com.helloworld.HelloWorldService.HelloWorldService_PortType {
  private String _endpoint = null;
  private com.helloworld.HelloWorldService.HelloWorldService_PortType helloWorldService_PortType = null;
  
  public HelloWorldServiceProxy() {
    _initHelloWorldServiceProxy();
  }
  
  public HelloWorldServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initHelloWorldServiceProxy();
  }
  
  private void _initHelloWorldServiceProxy() {
    try {
      helloWorldService_PortType = (new com.helloworld.HelloWorldService.HelloWorldService_ServiceLocator()).getHelloWorldServicePort();
      if (helloWorldService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)helloWorldService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)helloWorldService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (helloWorldService_PortType != null)
      ((javax.xml.rpc.Stub)helloWorldService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.helloworld.HelloWorldService.HelloWorldService_PortType getHelloWorldService_PortType() {
    if (helloWorldService_PortType == null)
      _initHelloWorldServiceProxy();
    return helloWorldService_PortType;
  }
  
  public com.helloworld.HelloWorldService.SayHelloResponse sayHello(com.helloworld.HelloWorldService.SayHelloRequest username) throws java.rmi.RemoteException{
    if (helloWorldService_PortType == null)
      _initHelloWorldServiceProxy();
    return helloWorldService_PortType.sayHello(username);
  }
  
  
}