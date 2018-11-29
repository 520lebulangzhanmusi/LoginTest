package com.service;

import com.bean.Users;

public interface UsersService {
	
	/**根据username登录验证
	 * @param username
	 * @return
	 */
	public Users loginValidate(String username);
}
