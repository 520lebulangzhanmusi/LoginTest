package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Users;
import com.dao.UsersDAO;
import com.service.UsersService;

@Service("usersService")
@Transactional
public class UsersServiceimpl implements UsersService{
	
    @Resource
	private UsersDAO usersDAO;//把dao层的usersdao注入到这里来，这样serviceimpl就可以调用usersdao了
	
	public UsersDAO getUsersDAO() {
		return usersDAO;
	}

	public void setUsersDAO(UsersDAO usersDAO) {
		this.usersDAO = usersDAO;
	}

	@Override
	public Users loginValidate(String username) {
		
		return this.usersDAO.findByUsername(username);//调用usersdao的方法
	}

}
