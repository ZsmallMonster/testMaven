package com.zhh.yh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhh.yh.dao.SysUserMapper;
import com.zhh.yh.entity.SysUserEntity;
import com.zhh.yh.service.SysUserService;
/**
 * 
 * @version
 * 
 * @author Administrator
 *
 */
@Service
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Override
	public SysUserEntity getByUserName(String username) {
		
		return sysUserMapper.getByUserName(username);
	
	}
	
	@Override
	public int saveUser(SysUserEntity user) {

		return sysUserMapper.saveUser(user);
	}

	@Override
	public List<SysUserEntity> findAllUser() {
		
		return sysUserMapper.findAllUser();
	}

}
