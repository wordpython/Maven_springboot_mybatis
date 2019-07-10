package com.wordpython.mapper;

import com.wordpython.po.User;

/*
 * 相比于 xml 映射方式，注解方式明显更简洁，但没有 xml 方式灵活。目前大部分公司还是主要用 xml 方式。
 */
public interface UserMapper {
	
	public User findByUsername(String name);
	public int save(User user);
}
