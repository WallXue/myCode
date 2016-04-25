package com.fm.dao.impl;

import org.springframework.stereotype.Repository;

import com.fm.base.dao.BaseDaoImpl;
import com.fm.dao.MyWantDao;
import com.fm.entity.MyWant;

@Repository
public class MyWantDaoImpl extends BaseDaoImpl<MyWant, Long> implements MyWantDao {

	@Override
	protected Class<?> getEntityClass() {
		return MyWant.class;
	}

}
