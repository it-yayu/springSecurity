package com.xyy.security.spring_security.service;

import com.xyy.security.spring_security.dao.SysRoleMapper;
import com.xyy.security.spring_security.entity.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yayu
 * @title: SysRoleService
 * @description: TODO
 * @date 2020/10/12 13:33
 */
@Service
public class SysRoleService {
    @Autowired
    private SysRoleMapper roleMapper;

    public SysRole selectById(Integer id){
        return roleMapper.selectById(id);
    }
}

