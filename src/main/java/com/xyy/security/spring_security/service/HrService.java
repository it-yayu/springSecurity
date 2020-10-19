package com.xyy.security.spring_security.service;

import com.xyy.security.spring_security.dao.HrMapper;
import com.xyy.security.spring_security.entity.Hr;
import com.xyy.security.spring_security.entity.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @作者 江南一点雨
 * @公众号 江南一点雨
 * @微信号 a_java_boy
 * @GitHub https://github.com/lenve
 * @博客 http://wangsong.blog.csdn.net
 * @网站 http://www.javaboy.org
 * @时间 2019-09-20 8:21
 */
@Service
public class HrService implements UserDetailsService {
    @Autowired
    HrMapper hrMapper;
    @Autowired
    private BCryptPasswordEncoder encoder;



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Hr hr = hrMapper.loadUserByUsername(username);
        if (hr == null) {
            throw new UsernameNotFoundException("用户名不存在!");
        }
        hr.setRoles(hrMapper.getHrRolesById(hr.getId()));
        return hr;
    }


    public RespBean add(Hr hr) {
        try {
            hr.setPassword(encoder.encode(hr.getPassword()));
            hrMapper.insert(hr);
            return RespBean.ok("插入成功!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return RespBean.error("添加失败!");
    }


}
