package com.fm.base.dao;

import java.io.Serializable;
import java.util.List;

import com.fm.base.entity.BaseEntity;

public interface BaseDao<T extends BaseEntity, K extends Serializable> {
	
	public void create(T entity);
	public void update(T entity);
	public void remove(K id);
	public T get(K id);
	public List<T> getAll();

}
