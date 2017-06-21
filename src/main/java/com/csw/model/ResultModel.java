package com.csw.model;

import com.csw.constant.ExceptionCode;

/**
 * Created by csw on 2016/5/25.
 * annotation：结果模板
 */

public class ResultModel {

    private final Integer code;

    private final String msg;

    public ResultModel(String msg) {
        this.code = 200;
        this.msg = msg;
    }

    public ResultModel(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultModel(ExceptionCode exceptionCode) {
        this.code = exceptionCode.getCode();
        this.msg = exceptionCode.name();
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
