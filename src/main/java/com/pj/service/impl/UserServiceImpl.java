package com.pj.service.impl;

import com.pj.dao.UserMapper;
import com.pj.pojo.User;
import com.pj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    //校验用户名和密码
    public boolean checkUser(User user){
        User user1 = userMapper.getUserById(user.getUserId());
        boolean res;
        if (user1 != null&&!user1.equals("")) {
            res = user1.getPwd() == user.getPwd();
        }else {
            res =false;
        }
        return res;
    }
}
