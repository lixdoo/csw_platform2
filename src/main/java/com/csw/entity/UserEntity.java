package com.csw.entity;

import javax.persistence.*;

/**
 * Created by csw on 2017/6/19.
 * Description:
 */
@Entity
@Table(name = "csw_user", schema = "", catalog = "csw")
public class UserEntity {

    private Long id;
    private String userName;
    private String password;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
