package jaxws.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public class ShopInfo {

	@WebMethod
	@WebResult(partName = "lookupOutput")
	public String getShopInfo(
			@WebParam(partName = "lookupInput") String property) {
		String response = "Invalid property";
		if (property.equals("shopName")) {
			response = "Test Market";
		} else if (property.equals("since")) {
			response = "since 2014";
		}
		return response;
	}
}
