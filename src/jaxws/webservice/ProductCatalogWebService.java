package jaxws.webservice;


import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ProductCatalogWebService {

	ProductCatalogData pCatalogData = new ProductCatalogData();

	@WebMethod 
	public List<String> getProductCategories() {
		return pCatalogData.getProductCategories();
	}
	
	@WebMethod
	public List<String> getProducts (String category){
		return pCatalogData.getProducts(category);
	}
	
	@WebMethod
	public boolean addProduct(String category, String product){
		return pCatalogData.addProduct(category, product);
	}
}
