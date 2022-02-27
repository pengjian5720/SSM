package com.pj.controller;

import com.pj.dao.UserMapper;
import com.pj.pojo.User;
import com.pj.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoginServletTest {
    @Test
    public void testLogin(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean(UserMapper.class);
        User user = userMapper.getUserById(2022001001);
        UserService userService = context.getBean("userService", UserService.class);


        System.out.println(user);
    }
}
