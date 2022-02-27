package com.pj.dao;

import com.pj.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {
    @Test
    public void testUserDao(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper bean = context.getBean(UserMapper.class);
        User user = bean.getUserById(2022001001);
        System.out.println(user);
    }
}
