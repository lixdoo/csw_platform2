package com.csw.service;

import com.csw.entity.AuthFunctionEntity;

import java.util.List;

/**
 * Created by csw on 2017/6/22.
 * Description:
 */
public interface AuthFunctionService {
    AuthFunctionEntity create(AuthFunctionEntity authFunctionEntity);

    AuthFunctionEntity update(AuthFunctionEntity authFunctionEntity);

    AuthFunctionEntity delete(Long id);

    List<AuthFunctionEntity> findAll();
}
