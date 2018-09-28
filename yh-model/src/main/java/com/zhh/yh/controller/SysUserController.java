package com.zhh.yh.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
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
		
	//提交到那里了？
		
		//String username = "zhangsan";
		//SysUserEntity u = sysUserService.getByUserName(username);
		System.out.println("=====================================>>");
		return "user/add.html";
	}
	
	//@ModelAttribute
	@RequestMapping("add")
	public Map saveUser(HttpServletRequest request,
			HttpServletResponse response,
			SysUserEntity user) {
		System.out.println("=======>>>>终于进来了！");
		//user.setUsername("王刚");
		//user.setPassword("123456");
		sysUserService.saveUser(user);
		Map<String, Object> result = new HashMap<String,Object>();
		result.put("success", true);
		result.put("msg", "保存成功");
		JSON.toJSON(result);
		//返回到用户列表用页面
		return result;//执行了，但是怎么就是不到这个页面。html页面里的ajax中的success也并未出现，
	}
	
}
