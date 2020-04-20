package com.lovo.userservice.dao;

import com.lovo.userservice.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IUserDao extends CrudRepository<UserEntity,String> {

    @Query("from UserEntity where userName=?1 and password=?2")
    UserEntity findUserNameAndPassword(String userName,String password);
}
