package com.zhh.yh.service;

import java.util.List;

import com.zhh.yh.entity.SysUserEntity;

/**
 * 
 * @author Administrator
 *
 */
public interface SysUserService {

	SysUserEntity getByUserName(String username);
	
	int saveUser(SysUserEntity user);
	
	List<SysUserEntity> findAllUser();
}
