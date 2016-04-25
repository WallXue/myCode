package com.fm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fm.base.dao.BaseDao;
import com.fm.base.service.BaseServiceImpl;
import com.fm.dao.UserDao;
import com.fm.entity.User;
import com.fm.service.UserService;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User, Long> implements UserService {

	@Autowired
	private UserDao ud;
	
	public BaseDao<User, Long> getDao() {
		return ud;
	}

}
