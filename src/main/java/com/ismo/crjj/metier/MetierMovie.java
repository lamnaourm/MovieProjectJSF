package com.ismo.crjj.metier;

import java.util.List;

import com.ismo.crjj.dao.DaoMovie;
import com.ismo.crjj.dao.IDao;
import com.ismo.crjj.model.Movie;

public class MetierMovie implements IMetier<Movie> {

	IDao<Movie> dao = new DaoMovie();
	
	@Override
	public List<Movie> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

}
