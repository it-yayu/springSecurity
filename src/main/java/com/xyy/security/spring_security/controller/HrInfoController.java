package com.xyy.security.spring_security.controller;


import com.xyy.security.spring_security.entity.Hr;
import com.xyy.security.spring_security.entity.RespBean;
import com.xyy.security.spring_security.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @作者 江南一点雨
 * @公众号 江南一点雨
 * @微信号 a_java_boy
 * @GitHub https://github.com/lenve
 * @博客 http://wangsong.blog.csdn.net
 * @网站 http://www.javaboy.org
 * @时间 2020-03-01 13:07
 */
@RestController
public class HrInfoController {

    @Autowired
    HrService hrService;

    //    @Value("${fastdfs.nginx.host}")
    String nginxHost;


    @PostMapping("/hr/add")
    public RespBean add(@RequestBody Hr hr) {
        return hrService.add(hr);
    }


}