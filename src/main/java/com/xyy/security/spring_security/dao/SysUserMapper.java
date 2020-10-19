package com.xyy.security.spring_security.dao;

import com.xyy.security.spring_security.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author yayu
 * @title: SysUserMapper
 * @description: TODO
 * @date 2020/10/12 13:28
 */
@Mapper
public interface SysUserMapper {
    @Select("SELECT * FROM sys_user WHERE id = #{id}")
    SysUser selectById(Integer id);

    @Select("SELECT * FROM sys_user WHERE name = #{name}")
    SysUser selectByName(String name);
}
