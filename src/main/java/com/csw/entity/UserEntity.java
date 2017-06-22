package com.csw.entity;

import javax.persistence.*;

/**
 * Created by csw on 2017/6/19.
 * Description:
 */
@Entity
@Table(name = "auth_user", schema = "", catalog = "csw")
public class UserEntity extends BaseEntity {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
