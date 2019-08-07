/**
 * SendSMSSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NET.webserviceX.www;

public interface SendSMSSoap extends java.rmi.Remote {

    /**
     * Send unlimited free
     * 				SMS to India - Maximum message size is 120
     * 				characters<br><br><b>Usage:</b>If your
     * 				mobile number is 098XXXXXXXX ,Please enter as
     * 				98XXXXXXXX<br><b>Network Covered:</b> Airtel,Idea
     * 				Cellular,Skycell ,RPG Cellular,Hutch,Celforce / Fascel,BPL
     * 				Mobile,Escotel
     */
    public NET.webserviceX.www.SMSResult sendSMSToIndia(java.lang.String mobileNumber, java.lang.String fromEmailAddress, java.lang.String message) throws java.rmi.RemoteException;
}
