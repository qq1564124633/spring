package com.lym.test;

import com.lym.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liyumin
 * @date 2022/09/13 16:56
 */
public class UserServiceTest {
    @Test
    public void test01(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.save();
    }
}
