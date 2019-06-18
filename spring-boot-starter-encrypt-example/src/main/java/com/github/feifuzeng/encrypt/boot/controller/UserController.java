package com.github.feifuzeng.encrypt.boot.controller;

import com.github.feifuzeng.encrypt.boot.anno.Decrypt;
import com.github.feifuzeng.encrypt.boot.anno.Encrypt;
import com.github.feifuzeng.encrypt.boot.bo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author feifz
 * @version 1.0.0
 * @Description 用户管理-控制器
 * @createTime 2019年06月17日 15:47:00
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Encrypt
    @RequestMapping("/list")
    @ResponseBody
    public List<User> query(){
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setGender(1);
        user.setId("1");
        user.setName("11111");
        list.add(user);
        return list;
    }

    @Encrypt
    @Decrypt
    @RequestMapping("/queryList")
    @ResponseBody
    public List<User> queryList(@RequestBody User user){
        List<User> list = new ArrayList<>();
        list.add(user);
        return list;
    }
}
