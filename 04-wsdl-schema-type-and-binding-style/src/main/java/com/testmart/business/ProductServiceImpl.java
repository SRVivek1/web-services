package com.testmart.business;

import java.util.ArrayList;
import java.util.List;

import com.testmart.catalog.model.Product;

public class ProductServiceImpl {

	private List<String> bookList = new ArrayList<>();
	private List<String> movieList = new ArrayList<>();
	private List<String> musicList = new ArrayList<>();

	public ProductServiceImpl() {
		this.bookList.add("Book1");
		this.bookList.add("Book2");
		this.bookList.add("Book3");

		this.movieList.add("Movie1");
		this.movieList.add("Movie2");
		this.movieList.add("Movie3");

		this.musicList.add("Music1");
		this.musicList.add("Music2");
		this.musicList.add("Music3");
	}

	public List<String> getProductCatogeries() {
		List<String> categories = new ArrayList<String>();
		categories.add("Movies");
		categories.add("Music");
		categories.add("Books");
		return categories;
	}

	public List<String> getProducts(String categories) {
		switch (categories.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return movieList;
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

	public List<Product> getProductsv2(String categories) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Book1v2", "1234", 999.5));
		productList.add(new Product("Book2v2", "5678", 888.5));
		return productList;
	}
}
