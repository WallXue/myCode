package com.fm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fm.entity.MyWant;
import com.fm.entity.User;
import com.fm.service.MyWantService;
import com.fm.service.UserService;

@Controller
public class IndexController {
	
	@Autowired
	private UserService ud;
	
	@Autowired
	private MyWantService ms;
	
	public IndexController() {
		System.out.println("iiiiiiiiiiiiiiiiiiiiiiiiiiiisssssssssssssssssssss");
	}

	@RequestMapping("/test")
	@ResponseBody
	public List<User> index() {
		User u = new User();
		u.forCreate();
		ud.create(u);
		return ud.getAll();
	}
	
	@RequestMapping("/want")
	@ResponseBody
	public String want() {
		User user = ud.get(1L);
		user.setMm("111111111111111111111111111111");
		MyWant mw = new MyWant();
		user.setWant(mw);
		ud.update(user);
		return "ss";
	}
	
	@RequestMapping("/restfull")
	@ResponseBody
	public Map<String, String> restfull() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "³õ¼û£¡");
		return map;
	}

	@RequestMapping("/testpost")
	@ResponseBody
	public Map<String, String> testpost(@RequestParam String name) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", name);
		return map;
	}
}
