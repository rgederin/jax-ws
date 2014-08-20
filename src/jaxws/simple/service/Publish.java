package jaxws.simple.service;

import javax.xml.ws.Endpoint;

/**
 * Publish web service on the jdk's web server
 * @author rgederin
 *
 */
public class Publish {
	public static void main(String[] args) {

		Endpoint.publish("http://localhost:8080/WS/HelloWorld",
				new HelloWorldImpl());
	}
}
