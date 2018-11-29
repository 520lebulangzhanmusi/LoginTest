package com.dao;

import com.bean.Users;

public interface UsersDAO {
	
    /**根据username查询
     * @param username
     * @return
     */
    public Users findByUsername(String username);
}
