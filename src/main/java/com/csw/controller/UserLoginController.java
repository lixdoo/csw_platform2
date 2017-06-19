package com.csw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by csw on 2017/6/19.
 * Description:
 */
@RestController
@RequestMapping("api/users")
public class UserLoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@RequestParam(value = "username") String username) {
        System.out.println("username: " + username);
        return "login success!" + username;
    }

}
