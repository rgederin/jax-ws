package jaxws.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface="jaxws.webservice.IProductCatalog", portName = "ProductCatalogPort", serviceName = "ProductCatalogService")
public class ProductCatalogWebService implements IProductCatalog {

	ProductCatalogData pCatalogData = new ProductCatalogData();

	@Override
	public List<String> getProductCategories() {
		return pCatalogData.getProductCategories();
	}

	@Override
	public List<String> getProducts(String category) {
		return pCatalogData.getProducts(category);
	}

	@Override
	public boolean addProduct(String category, String product) {
		return pCatalogData.addProduct(category, product);
	}

	@Override
	public List<Product> getProductsV2(String category) {
		return pCatalogData.getProductsV2(category);
	}

	@Override
	public Object testExclude() {
		return null;
	}
}
