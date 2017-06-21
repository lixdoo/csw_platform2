package com.csw.controller;

import com.csw.constant.ExceptionCode;
import com.csw.entity.UserEntity;
import com.csw.model.ResultModel;
import org.apache.commons.lang3.Validate;
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
public class UserLoginController extends BaseController{

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResultModel login(@RequestParam(required = true) String username,
                             @RequestParam(required = true) String password) {
        Validate.notNull(username, "The username must not be null.");
        Validate.notNull(password, "The password must not be null.");
        log.info(String.format("Receive login information by userName[%s], password[%s].", username, password));

        ResultModel resultModel;

        if(username.equals("1") && password.equals("1")) {
            log.info(String.format("Login success. username: [%s]", username));
            resultModel = new ResultModel(ExceptionCode.LOGIN_SUCCESS);
        } else {
            resultModel = new ResultModel(ExceptionCode.LOGIN_FAILURE);
            log.info(String.format("Login failure. username: [%s]", password));
        }

        return resultModel;
    }

}
