package com.lovo.userservice.service.impl;

import com.lovo.userservice.dao.IUserDao;
import com.lovo.userservice.entity.UserEntity;
import com.lovo.userservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserDao userDao;

    @Transactional
    public void saveUser(UserEntity userEntity) {
      userDao.save(userEntity);
    }

    @Override
    public UserEntity getUser(String userName, String password) {

        return userDao.findUserNameAndPassword(userName,password);
    }
}
