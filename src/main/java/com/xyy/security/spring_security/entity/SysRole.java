package com.xyy.security.spring_security.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yayu
 * @title: SysRole
 * @description: TODO
 * @date 2020/10/12 13:26
 */
@Data
public class SysRole implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    // 省略getter/setter
}
