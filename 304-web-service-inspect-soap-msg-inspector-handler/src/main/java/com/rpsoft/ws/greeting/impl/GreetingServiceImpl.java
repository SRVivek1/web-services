package com.rpsoft.ws.greeting.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Set;

import javax.jws.HandlerChain;
import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.axis.utils.StringUtils;

import com.rpsoft.ws.greeting.beans.GreetingMessage;
import com.rpsoft.ws.greeting.beans.ObjectFactory;
import com.rpsoft.ws.greeting.beans.Person;

@WebService(serviceName = "GreetingService", endpointInterface = "com.rpsoft.ws.greeting.service.GreetingService")
@HandlerChain(file = "handler/soapHandlers.xml")
public class GreetingServiceImpl implements SOAPHandler<SOAPMessageContext> {

	/** Line separator constant */
	final String m_new_line = System.getProperty("line.separator");

	/** Object factory for web service beans object creation */
	final ObjectFactory OBJECT_FACTORY = new ObjectFactory();

	/**
	 * Simulated method
	 * 
	 * @param person
	 * @return GreetingMessage
	 */
	public GreetingMessage sayGoodMorning(Person person) {
		GreetingMessage greetingMessage = this.OBJECT_FACTORY.createGreetingMessage();
		greetingMessage.setGreeting("Good Morning Mr. " + person.getFName());
		return greetingMessage;
	}

	/**
	 * Simulated method
	 * 
	 * @param person
	 * @return GreetingMessage
	 */
	public GreetingMessage sayGoodNight(Person person) {
		GreetingMessage greetingMessage = this.OBJECT_FACTORY.createGreetingMessage();
		greetingMessage.setGreeting("Good Night Mr. " + person.getFName());
		return greetingMessage;
	}

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		Boolean outBoundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

		if (!outBoundProperty) {
			System.out.println("Soap Request : ");
		} else {
			System.out.println("Soap Response : ");
		}

		final ByteArrayOutputStream bOutputStream = new ByteArrayOutputStream();
		String soapMessage = null;
		try {
			context.getMessage().writeTo(bOutputStream);
			soapMessage = bOutputStream.toString();
		} catch (SOAPException | IOException e) {
			e.printStackTrace();
		}

		System.out.println(this.formatXml(soapMessage));

		return true;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		System.out.println("handleFault(SOAPMessageContext)");
		return true;
	}

	@Override
	public void close(MessageContext context) {
		System.out.println("close(MessageContext)");
	}

	@Override
	public Set<QName> getHeaders() {
		System.out.println("getHeaders()");
		return null;
	}

	/*
	 * This method formats XML string
	 */
	public final String formatXml(final String xmlString) {

		final String formattedXML = "Warning : Nothig to format.";

		final String string_yes = "yes";
		final Integer integer_value_2 = new Integer(2);

		final String message_header = "Message : ";

		if (null == xmlString || StringUtils.isEmpty(xmlString)) {
			return formattedXML.concat(message_header.concat(xmlString));
		}

		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		transformerFactory.setAttribute("indent-number", integer_value_2);

		Transformer transformer = null;
		try {
			transformer = transformerFactory.newTransformer();
		} catch (TransformerConfigurationException e1) {
			e1.printStackTrace();
		}
		transformer.setOutputProperty(OutputKeys.INDENT, string_yes);
		transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, string_yes);

		final Source xmlInput = new StreamSource(new StringReader(xmlString));
		final StringWriter stringWriter = new StringWriter();
		final StreamResult xmlOutput = new StreamResult(stringWriter);

		try {
			transformer.transform(xmlInput, xmlOutput);
		} catch (TransformerException e) {
			e.printStackTrace();
		}
		return xmlOutput.getWriter().toString();

	}
}
