package jaxws.simple.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * JAXWSService Endpoint Interface A service endpoint interface or service
 * endpoint implementation (SEI) is a Java interface or class, respectively,
 * that declares the methods that a client can invoke on the service. An
 * interface is not required when building a JAX-WS endpoint. The web service
 * implementation class implicitly defines an SEI
 * 
 * @author rgederin
 * 
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorld {
	@WebMethod
	public String helloWorld(String name);
}
