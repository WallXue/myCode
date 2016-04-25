package com.fm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fm.base.dao.BaseDao;
import com.fm.base.service.BaseServiceImpl;
import com.fm.dao.MyWantDao;
import com.fm.entity.MyWant;
import com.fm.service.MyWantService;

@Service
@Transactional
public class MyWantServiceImpl extends BaseServiceImpl<MyWant, Long> implements MyWantService {

	@Autowired
	private MyWantDao ud;
	
	public BaseDao<MyWant, Long> getDao() {
		return ud;
	}

}
