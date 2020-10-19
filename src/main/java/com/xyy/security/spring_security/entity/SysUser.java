package com.xyy.security.spring_security.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yayu
 * @title: SysUser
 * @description: TODO
 * @date 2020/10/12 13:25
 */
@Data
public class SysUser implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String password;

    // 省略getter/setter
}
