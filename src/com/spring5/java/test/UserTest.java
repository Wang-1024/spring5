package com.spring5.java.test;

import com.spring5.java.dao.UserInfo;
import com.spring5.java.demo1.Stu;
import com.spring5.java.demo1.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void userTest(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("bean1.xml");

        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);

        Stu stu = applicationContext.getBean("stu", Stu.class);
        System.out.println(stu);
    }


}
