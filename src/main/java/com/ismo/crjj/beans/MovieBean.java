package com.ismo.crjj.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.ismo.crjj.metier.IMetier;
import com.ismo.crjj.metier.MetierMovie;
import com.ismo.crjj.model.Movie;

@ManagedBean
@RequestScoped
public class MovieBean {

	List<Movie> movies;
	IMetier<Movie> metier = new MetierMovie();
	
	public MovieBean() {
		movies = metier.getAll();
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	
	
}
