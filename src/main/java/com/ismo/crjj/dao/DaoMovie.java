package com.ismo.crjj.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ismo.crjj.model.Movie;
import com.ismo.store.utils.HibernateUtils;

public class DaoMovie implements IDao<Movie> {

	@Override
	public List<Movie> getAll() {
		Session s = HibernateUtils.getSessionfactory().getCurrentSession();
		Transaction t = s.beginTransaction();

		List<Movie> cats = s.createQuery("from Movie").list();

		t.commit();
		s.close();

		return cats;
	}

}
