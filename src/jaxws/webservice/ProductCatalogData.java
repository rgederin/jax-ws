package jaxws.webservice;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalogData {
	List<String> bookList = new ArrayList<String>();
	List<String> musicList = new ArrayList<String>();
	List<String> movieList = new ArrayList<String>();

	public ProductCatalogData() {
		bookList.add("Harry Potter 1");
		bookList.add("The Game of Thrones");

		musicList.add("Andrea Bocelli");
		musicList.add("Placido Domingo");

		movieList.add("Rembo");
		movieList.add("Predator");
	}

	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<String>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}

	public List<String> getProducts(String category) {
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		default:
			return null;
		}
	}

	public boolean addProduct(String category, String product) {
		switch (category.toLowerCase()) {
		case "books":
			bookList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
		case "movies":
			movieList.add(product);
			break;
		default:
			return false;
		}
		return true;
	}

	public List<Product> getProductsV2(String category) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("Pavarotti CD", "122", 100.34));
		products.add(new Product("The three tenors CD", "1432422", 400));
		return products;
	}
}
