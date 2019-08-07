package com.testmart.business;

import java.util.ArrayList;
import java.util.List;

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
}
