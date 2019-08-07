package com.testmart.catalog.business;

import java.util.ArrayList;
import java.util.List;

import com.testmart.catalog.beans.Product;

public class ProductCatalogInfo {

	List<String> categoriesList = new ArrayList<String>();
	private List<Product> bookList = new ArrayList<>();
	private List<Product> movieList = new ArrayList<>();
	private List<Product> musicList = new ArrayList<>();

	public ProductCatalogInfo() {
		
		System.out.println("********ProductCatalogInfo Object created.");
		this.categoriesList.add("Books");
		this.categoriesList.add("Movies");
		this.categoriesList.add("Music");

		this.bookList.add(new Product("Book1", "1234", 568.23));
		this.bookList.add(new Product("Book2", "3456", 452.14));
		this.bookList.add(new Product("Book3", "5678", 123.56));

		this.movieList.add(new Product("Movie1", "1234", 568.23));
		this.movieList.add(new Product("Movie2", "3456", 452.14));
		this.movieList.add(new Product("Movie3", "5678", 123.56));

		this.musicList.add(new Product("Music1", "1234", 568.23));
		this.musicList.add(new Product("Music2", "3456", 452.14));
		this.musicList.add(new Product("Music3", "5678", 123.56));
	}

	public List<String> getProductCategories() {
		return this.categoriesList;
	}

	public List<Product> getProducts(String categories) {
		switch(categories.toLowerCase()){
		case "books":
			return bookList;
		case "movies":
			return movieList;
		case "music":
			return musicList;
		default :
			return null;
		}
	}

	public boolean addProduct(String category, String product) {
		switch(category.toLowerCase()){
		case "books":
			bookList.add(new Product(product, "", 0.0));
			break;
		case "movies":
			movieList.add(new Product(product, "", 0.0));
			break;
		case "music":
			movieList.add(new Product(product, "", 0.0));
			break;
		default :
			return false;
		}
		return true;
	}

}
