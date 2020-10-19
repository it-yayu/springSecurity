package com.xyy.security.spring_security.controller;

import com.xyy.security.spring_security.entity.SysUser;
import com.xyy.security.spring_security.service.RegistUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author yayu
 * @title: RegistUser
 * @description: TODO
 * @date 2020/10/12 14:14
 */
@RestController
@RequestMapping("/add")
public class RegistUserController {
    @Autowired
    private RegistUserService registUserService;

    @RequestMapping("/user")
    public Map addUser(@RequestBody SysUser user) {
        return registUserService.addUser(user);
    }
}
