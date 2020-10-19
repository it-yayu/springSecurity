package com.xyy.security.spring_security.service;

import com.xyy.security.spring_security.dao.SysUserRoleMapper;
import com.xyy.security.spring_security.entity.SysUserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yayu
 * @title: SysUserRoleService
 * @description: TODO
 * @date 2020/10/12 13:33
 */
@Service
public class SysUserRoleService {
    @Autowired
    private SysUserRoleMapper userRoleMapper;

    public List<SysUserRole> listByUserId(Integer userId) {
        List<SysUserRole> sysUserRoles = userRoleMapper.listByUserId(userId);
        System.out.println(sysUserRoles.size());
        return userRoleMapper.listByUserId(userId);
    }
}

