package com.xyy.security.spring_security.dao;

import com.xyy.security.spring_security.entity.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author yayu
 * @title: SysRoleMapper
 * @description: TODO
 * @date 2020/10/12 13:29
 */
@Mapper
public interface SysRoleMapper {
    @Select("SELECT * FROM sys_role WHERE id = #{id}")
    SysRole selectById(Integer id);
}
