package com.example.demo.controller;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


/**
 * @author : xujunbao
 * @ClassName com.example.demo.controller
 * @description
 * @Create Date : 2018/8/6
 */
@Controller
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/user")
    public String getUser(ModelMap modelMap) {
        try {
            List<User> userList = userMapper.selectUserByName();
            modelMap.addAttribute("userList",userList);
            return "index";
        } catch (Exception e) {
            System.out.print("+++++++user" + e);
        }
        return "index";
    }

    @RequestMapping("/user1")
    @ResponseBody
    public List<User> getUser1() {
        List<User> userList=new ArrayList<>();
        try {
            userList = userMapper.selectUserByName();
            return userList;
        } catch (Exception e) {
            System.out.print("+++++++user" + e);
        }
        return userList;
    }
}
