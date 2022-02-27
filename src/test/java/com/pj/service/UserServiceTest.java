package com.pj.service;

import com.pj.pojo.User;
import com.pj.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {
    @Test
    public void testGetService(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User user =new User();
        user.setUserId(2022001001);
        user.setPwd(123456);
        boolean b = userService.checkUser(user);
        System.out.println(b);

    }
}
