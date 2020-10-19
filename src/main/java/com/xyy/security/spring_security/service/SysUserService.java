package com.xyy.security.spring_security.service;

import com.xyy.security.spring_security.dao.SysUserMapper;
import com.xyy.security.spring_security.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yayu
 * @title: SysUserService
 * @description: TODO
 * @date 2020/10/12 13:33
 */
@Service
public class SysUserService {
    @Autowired
    private SysUserMapper userMapper;

    public SysUser selectById(Integer id) {
        return userMapper.selectById(id);
    }

    public SysUser selectByName(String name) {
        return userMapper.selectByName(name);
    }
}
