package jaxws.simple.service;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 * Simple client
 * @author rgederin
 *
 */
public class Client {
	public static void main (String[] args) throws MalformedURLException{
		URL url = new URL("http://localhost:8080/WS/HelloWorld?wsdl");
		QName qName = new QName("http://service.simple.jaxws/", "HelloWorldImplService");
		Service service = Service.create(url,qName);
		HelloWorld helloWorldService = service.getPort(HelloWorld.class);
		System.out.println(helloWorldService.helloWorld("Ruslan"));
	}
}
