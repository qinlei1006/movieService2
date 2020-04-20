package com.lovo.userservice.service;

import com.lovo.userservice.entity.UserEntity;

public interface IUserService {

    public void saveUser(UserEntity userEntity);

    /**
     * 获取用户对象
     * @param userName 用户名
     * @param password 密码
     * @return 用户
     */
    public UserEntity getUser(String userName,String password);

}
