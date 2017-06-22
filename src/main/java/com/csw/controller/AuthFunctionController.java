package com.csw.controller;

import com.csw.entity.AuthFunctionEntity;
import com.csw.service.AuthFunctionService;
import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by csw on 2017/6/22.
 * Description:
 */
@RestController
@RequestMapping("api/authFunctions")
public class AuthFunctionController extends BaseController {

    @Autowired
    private AuthFunctionService authFunctionService;

    @RequestMapping(method = RequestMethod.GET)
    public List<AuthFunctionEntity> getAll() {

        return authFunctionService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public AuthFunctionEntity create(@RequestBody AuthFunctionEntity authFunctionEntity) {
        Validate.notNull(authFunctionEntity, "The authFunctionEntity must not be null, update failure.");
        authFunctionEntity = authFunctionService.create(authFunctionEntity);

        return authFunctionEntity;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public AuthFunctionEntity update(@PathVariable Long id,
                                    @RequestBody AuthFunctionEntity authFunctionEntity) {
        Validate.notNull(authFunctionEntity, "The authFunctionEntity must not be null, update failure.");
        Validate.notNull(id, "The id of authFunctionEntity must not be null, update failure.");

        log.info(String.format("Controller receive authFunctionEntity'id is: [%d], fullName is: [%s]", authFunctionEntity.getId(), authFunctionEntity.getFullName()));

        authFunctionEntity.setId(id);
        AuthFunctionEntity updated = authFunctionService.update(authFunctionEntity);

        return updated;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public AuthFunctionEntity delete(@PathVariable Long id) {
        Validate.notNull(id, "The id of authFunctionEntity must not be null, delete failure.");

        return authFunctionService.delete(id);
    }
}
