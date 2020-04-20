package com.lovo.userservice.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "sys_user")
public class UserEntity {

    @Id
    @Column(name = "user_id",length = 32)
    @GenericGenerator(name = "user_uuid",strategy = "uuid")
    @GeneratedValue(generator = "user_uuid")
    private String userId;

    @Column(name = "user_name",length = 48)
    private String userName;

    @Column(name = "user_pass",length = 48)
    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
