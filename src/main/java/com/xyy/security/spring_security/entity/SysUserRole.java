package com.xyy.security.spring_security.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yayu
 * @title: SysUserRole
 * @description: TODO
 * @date 2020/10/12 13:26
 */
@Data
public class SysUserRole implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer userId;

    private Integer roleId;

    // 省略getter/setter
}

