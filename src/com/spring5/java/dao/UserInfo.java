package com.spring5.java.dao;

import org.springframework.stereotype.Component;

/**
 * 1.value定义的值相当于xml注解方式中id中定义的值，是唯一的
 * 2.在注解中value属性值可以省略不写（@Component），默认值是类名称（首字母小写）
 */
@Component(value="userInfo")
public class UserInfo {

    public void add(){
        System.out.println("add...");
    }
}
