package com.xyy.security.spring_security.dao;

import com.xyy.security.spring_security.entity.SysUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yayu
 * @title: RegistUserMapper
 * @description: TODO
 * @date 2020/10/12 14:18
 */
@Mapper
public interface RegistUserMapper {
//    @Insert("insert into sys_user value(#{id},#{name},#{password})")
    public void adduser(SysUser user);
}
