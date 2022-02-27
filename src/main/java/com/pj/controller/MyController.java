package com.pj.controller;

import com.pj.pojo.User;
import com.pj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName MyController
 * @Description TODO
 * @Author 彭建
 * @Date 2022/2/26 16:35
 * @Version 1.0
 **/
@Controller
public class MyController {
    private final UserService userService;

    public MyController(@Qualifier("userServiceImpl") UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/login")
    public String login(User user){
        String res="fail";
        System.out.println(user);
        if(userService.checkUser(user)){
            res="success";
        }
        return res;
    }
}
