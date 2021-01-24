package cn.jjdcn.demo.consumer.controller;

import cn.jjdcn.demo.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {

    @DubboReference(version = "${demo.service.version}")
    private UserService userService;

    @RequestMapping("/user")
    public String doGetUser(){
        return userService.sayHello("张三");
    }
}
