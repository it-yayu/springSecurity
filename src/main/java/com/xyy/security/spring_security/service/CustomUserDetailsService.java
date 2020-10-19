package com.xyy.security.spring_security.service;

import com.xyy.security.spring_security.entity.SysRole;
import com.xyy.security.spring_security.entity.SysUser;
import com.xyy.security.spring_security.entity.SysUserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author yayu
 * @title: CustomUserDetailsService
 * @description: TODO
 * @date 2020/10/12 13:39
 */
@Service("userDetailsService")
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private SysUserService userService;

    @Autowired
    private SysRoleService roleService;

    @Autowired
    private SysUserRoleService userRoleService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        // 从数据库中取出用户信息
        SysUser user = userService.selectByName(username);

        // 判断用户是否存在
        if(user == null) {
            throw new UsernameNotFoundException("USERNAME DOES NOT EXIST !");
        }

        // 添加权限
        List<SysUserRole> userRoles = userRoleService.listByUserId(user.getId());
        userRoles.forEach(userRole->{
            SysRole role = roleService.selectById(userRole.getRoleId());
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        });

        // 返回UserDetails实现类
        return new User(user.getName(), user.getPassword(), authorities);
    }
}

