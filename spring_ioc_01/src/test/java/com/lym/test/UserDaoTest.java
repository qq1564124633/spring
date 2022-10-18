package com.lym.test;

import com.lym.dao.UserDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * @author liyumin
 * @date 2022/09/13 14:53
 */
public class UserDaoTest {

    //依赖注入
    @Test
    public void test01() {
        //加载配置文件
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取UserDao对象
        UserDao userDao1 = (UserDao) app.getBean("userDao1");
        //输出对象地址
        System.out.println(userDao1);
        userDao1.save();
        app.close();
    }

    //静态工厂bean
    @Test
    public void test02() {
        //加载配置文件
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取UserDao对象
        UserDao userDao1 = (UserDao) app.getBean("userDao2");
        //输出对象地址
        System.out.println(userDao1);
        userDao1.save();
    }

    //实例工厂bean
    @Test
    public void test03() {
        //加载配置文件
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取UserDao对象
        UserDao userDao1 = (UserDao) app.getBean("userDao3");
        //输出对象地址
        System.out.println(userDao1);
        userDao1.save();
    }
}





