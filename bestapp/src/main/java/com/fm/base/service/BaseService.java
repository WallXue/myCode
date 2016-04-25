package com.fm.base.service;

import java.io.Serializable;
import java.util.List;

import com.fm.base.dao.BaseDao;
import com.fm.base.entity.BaseEntity;

public interface BaseService<T extends BaseEntity, K extends Serializable> {
	
	public BaseDao<T, K> getDao();
	
	public void create(T entity);

	public void update(T entity);

	public void remove(K id);

	public T get(K id);

	public List<T> getAll();
}
