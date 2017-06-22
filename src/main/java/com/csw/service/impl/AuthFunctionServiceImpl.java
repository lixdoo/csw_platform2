package com.csw.service.impl;

import com.csw.entity.AuthFunctionEntity;
import com.csw.repository.AuthFunctionRepository;
import com.csw.service.AuthFunctionService;
import com.csw.service.BaseService;
import com.csw.utils.BeanCopy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by csw on 2017/6/22.
 * Description:
 */
@Component("authFunctionService")
@Scope("prototype")
public class AuthFunctionServiceImpl extends BaseService implements AuthFunctionService {

    @Autowired
    private AuthFunctionRepository authFunctionRepository;

    @Override
    public AuthFunctionEntity create(AuthFunctionEntity authFunctionEntity) {

        AuthFunctionEntity created = authFunctionRepository.save(authFunctionEntity);

        return created;
    }

    @Override
    public AuthFunctionEntity update(AuthFunctionEntity authFunctionEntity) {

        AuthFunctionEntity updated = authFunctionRepository.findOne(authFunctionEntity.getId());
        if (updated == null) {

        }

        updated = (AuthFunctionEntity) BeanCopy.copyBean(authFunctionEntity, updated);

        AuthFunctionEntity saved = authFunctionRepository.save(updated);

        return saved;
    }

    @Override
    public AuthFunctionEntity delete(Long id) {

        AuthFunctionEntity deleted = authFunctionRepository.findOne(id);
        if (deleted == null) {

        }

        authFunctionRepository.delete(id);

        return deleted;
    }

    @Override
    public List<AuthFunctionEntity> findAll() {
        return (List<AuthFunctionEntity>) authFunctionRepository.findAll();
    }
}
