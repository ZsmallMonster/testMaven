package com.zhh.yh.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
@MapperScan
public interface SysRoleMapper {
	
	List<String> listUserRoles(Long userId);
	
}
