
package com.rpsoft.ws.greeting.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GreetingService", targetNamespace = "http://rpsoft.com/ws/greeting/service", wsdlLocation = "file:/C:/Windows/SystemD/WorkSpaces/workspace/WebServices/303-web-service-simulator-single-handler-multi-request/src/main/resource/wsdl/GreetingService.wsdl")
public class GreetingService_Service
    extends Service
{

    private final static URL GREETINGSERVICE_WSDL_LOCATION;
    private final static WebServiceException GREETINGSERVICE_EXCEPTION;
    private final static QName GREETINGSERVICE_QNAME = new QName("http://rpsoft.com/ws/greeting/service", "GreetingService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Windows/SystemD/WorkSpaces/workspace/WebServices/303-web-service-simulator-single-handler-multi-request/src/main/resource/wsdl/GreetingService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GREETINGSERVICE_WSDL_LOCATION = url;
        GREETINGSERVICE_EXCEPTION = e;
    }

    public GreetingService_Service() {
        super(__getWsdlLocation(), GREETINGSERVICE_QNAME);
    }

    public GreetingService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), GREETINGSERVICE_QNAME, features);
    }

    public GreetingService_Service(URL wsdlLocation) {
        super(wsdlLocation, GREETINGSERVICE_QNAME);
    }

    public GreetingService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GREETINGSERVICE_QNAME, features);
    }

    public GreetingService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GreetingService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GreetingService
     */
    @WebEndpoint(name = "GreetingServiceSOAP")
    public GreetingService getGreetingServiceSOAP() {
        return super.getPort(new QName("http://rpsoft.com/ws/greeting/service", "GreetingServiceSOAP"), GreetingService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GreetingService
     */
    @WebEndpoint(name = "GreetingServiceSOAP")
    public GreetingService getGreetingServiceSOAP(WebServiceFeature... features) {
        return super.getPort(new QName("http://rpsoft.com/ws/greeting/service", "GreetingServiceSOAP"), GreetingService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GREETINGSERVICE_EXCEPTION!= null) {
            throw GREETINGSERVICE_EXCEPTION;
        }
        return GREETINGSERVICE_WSDL_LOCATION;
    }

}