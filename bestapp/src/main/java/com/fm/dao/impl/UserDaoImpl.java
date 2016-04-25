package com.fm.dao.impl;

import org.springframework.stereotype.Repository;

import com.fm.base.dao.BaseDaoImpl;
import com.fm.dao.UserDao;
import com.fm.entity.User;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User, Long> implements UserDao {

	@Override
	protected Class<?> getEntityClass() {
		return User.class;
	}

}
