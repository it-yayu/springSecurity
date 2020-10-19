package com.xyy.security.spring_security.dao;

import com.xyy.security.spring_security.entity.SysUserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author yayu
 * @title: SysUserRoleMapper
 * @description: TODO
 * @date 2020/10/12 13:29
 */
@Mapper
public interface SysUserRoleMapper {
    @Select("SELECT * FROM sys_user_role WHERE user_id = #{userId}")
    List<SysUserRole> listByUserId(Integer userId);
}
