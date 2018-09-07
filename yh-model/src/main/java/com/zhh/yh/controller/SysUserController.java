package com.zhh.yh.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhh.yh.entity.SysUserEntity;
import com.zhh.yh.service.SysUserService;

/**
 * @version 1.0.0
 * @author Administrator
 *
 */
@Controller
public class SysUserController {

	@Autowired
	private SysUserService sysUserService;
	@RequestMapping("login")
	public String getUser(HttpServletRequest request,
				HttpServletResponse response,
				SysUserEntity user) {
		//String username = "test";
		//sysUserService.getByUserName(username);
		String username = "zhangsan";
		SysUserEntity u = sysUserService.getByUserName(username);
		System.out.println("=====================================>>");
		return "123.html";
	}
	
	public String saveUser(HttpServletRequest request,
			HttpServletResponse response,
			SysUserEntity user) {
		user.setUsername("123");
		user.setPassword("123");
		sysUserService.saveUser(user);
		//返回到用户列表用页面
		return "login";
	}
	
}
