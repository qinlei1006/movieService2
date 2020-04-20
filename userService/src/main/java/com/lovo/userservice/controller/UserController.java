package com.lovo.userservice.controller;

import com.lovo.userservice.entity.UserEntity;
import com.lovo.userservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("userSave/{userNameSave}/{passwordSave}")
    @ResponseBody //不做视图
    public String userSave(@PathVariable("userNameSave")String userNameSave,
                           @PathVariable("passwordSave")String passwordSave){
        System.out.println(userNameSave+"/"+userNameSave);
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName(userNameSave);
        userEntity.setPassword(passwordSave);
        userService.saveUser(userEntity);
        return "ok";
    }

    @RequestMapping("userInfo/{userName}/{password}")
    public UserEntity userInfo(@PathVariable("userName")String userName,
                               @PathVariable("password")String password){
        System.out.println(userName+"/"+password);
        return userService.getUser(userName,password);
    }


}
