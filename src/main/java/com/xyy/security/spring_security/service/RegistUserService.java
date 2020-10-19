package com.xyy.security.spring_security.service;

import com.xyy.security.spring_security.dao.RegistUserMapper;
import com.xyy.security.spring_security.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yayu
 * @title: RegistUserService
 * @description: TODO
 * @date 2020/10/12 14:16
 */
@Service
public class RegistUserService {
    @Autowired
    private RegistUserMapper registUserMapper;
//    @Autowired
//    private BCryptPasswordEncoder encoder;

    public Map addUser(SysUser user) {
        try {
//            user.setPassword(encoder.encode(user.getPassword()));
            registUserMapper.adduser(user);
            return new HashMap() {{
                put("msg", "插入成功");
                put("code", "200");
            }};
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new HashMap() {{
            put("msg", "插入失败");
            put("code", "500");
        }};
    }

}
