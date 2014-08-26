package jaxws.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "ProductCatalog")
public interface IProductCatalog {

	@WebMethod(action = "fetch_categories", operationName = "fetchCategories")
	public abstract List<String> getProductCategories();

	@WebMethod
	public abstract List<String> getProducts(String category);

	@WebMethod
	public abstract boolean addProduct(String category, String product);

	@WebMethod
	@WebResult(name="Product")
	public abstract List<Product> getProductsV2(String category);

	@WebMethod(exclude = true)
	public abstract Object testExclude();
}