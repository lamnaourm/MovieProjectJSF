package com.ismo.crjj.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Movie {

	private int id;
	private String title;
	private int year;
	private int runtime;
	private String genre1;
	private String genre2;
	private String genre3;
	private int rating;
	private String director;
	private String actors;
	private String plot;
	private String image;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public String getGenre1() {
		return genre1;
	}

	public void setGenre1(String genre1) {
		this.genre1 = genre1;
	}

	public String getGenre2() {
		return genre2;
	}

	public void setGenre2(String genre2) {
		this.genre2 = genre2;
	}

	public String getGenre3() {
		return genre3;
	}

	public void setGenre3(String genre3) {
		this.genre3 = genre3;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Movie(int id, String title, int year, int runtime, String genre1, String genre2, String genre3, int rating,
			String director, String actors, String plot, String image) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.runtime = runtime;
		this.genre1 = genre1;
		this.genre2 = genre2;
		this.genre3 = genre3;
		this.rating = rating;
		this.director = director;
		this.actors = actors;
		this.plot = plot;
		this.image = image;
	}

	public Movie() { 

	}
}
