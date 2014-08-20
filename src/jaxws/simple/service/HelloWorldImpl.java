package jaxws.simple.service;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(endpointInterface = "jaxws.simple.service.HelloWorld")
@SOAPBinding(style = Style.RPC)
public class HelloWorldImpl implements HelloWorld {

	public String helloWorld(String name) {
		return "Hello world from " + name;
	}

}
