package com.fm.base.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.fm.base.entity.BaseEntity;

public abstract class BaseDaoImpl<T extends BaseEntity, K extends Serializable> implements BaseDao<T, K> {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public T get(K key) {
		return (T) sessionFactory.getCurrentSession().get(getEntityClass(), key);
	}
	
	public void create(T entity) {
		sessionFactory.getCurrentSession().save(entity);
	}

	public void update(T entity) {
		sessionFactory.getCurrentSession().update(entity);		
	}

	public void remove(K id) {
		sessionFactory.getCurrentSession().delete(id);
	}

	public List<T> getAll() {
		Criteria c = sessionFactory.getCurrentSession().createCriteria(getEntityClass());
		return (List<T>)c.list();
	}


	protected abstract Class<?> getEntityClass();
}
