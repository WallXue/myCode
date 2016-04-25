package com.fm.base.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.fm.base.entity.BaseEntity;

@Transactional
public abstract class BaseServiceImpl<T extends BaseEntity, K extends Serializable> implements BaseService<T, K> {


	public void create(T entity) {
		getDao().create(entity);
	}

	public void update(T entity) {
		getDao().update(entity);
	}

	public void remove(K id) {
		getDao().remove(id);
	}

	public T get(K id) {
		return getDao().get(id);
	}

	public List<T> getAll() {
		return getDao().getAll();
	}

}
