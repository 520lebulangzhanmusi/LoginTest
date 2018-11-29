package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Users;
import com.service.UsersService;

/**登录控制器
 * @author Administrator
 *
 */
@Controller
public class LoginController extends GenericController{
	
    @Resource(name="usersService")
	private UsersService usersService;

	
		
		@RequestMapping("login.action")
		public ModelAndView login(Users users) {
		Users currentuser = usersService.loginValidate(users.getUsername());
		if(currentuser == null) {
			//括号内的三个值分别表示 要跳转的页面，页面提示信息的一个名字可以随便写，提示信息
		   return new ModelAndView("login.jsp","error","用户名不存在");
		   }else {
			if(currentuser.getPassword().equals(users.getPassword())) {
				session.setAttribute("currentUser", currentuser);
				return new ModelAndView("index.jsp");
			}else {
				return new ModelAndView("login.jsp","error","密码错误");
			}
		}
		 
		
		}
		
		

		

    
    
    
    
    
    
    
    
    
    
    
    
    
}
