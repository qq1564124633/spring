package com.lym.dao.impl;

import com.lym.dao.UserDao;
import com.lym.entity.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author liyumin
 * @date 2022/09/13 15:21
 * 工厂静态方法实例化
 */
public class UserDaoImpl implements UserDao {

    private String name;
    private int age;
    private List<String> strList;
    private Set<String> set;
    private Map<String, User> map;
    private Properties properties;
    private Set<User> userSet;
    private List<User> userList;

    public UserDaoImpl() {
        System.out.println("UserDaoImpl无参构造");
    }

    public UserDaoImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public UserDaoImpl(List<String> strList, Set<String> set, Map<String, User> map, Properties properties) {
        this.strList = strList;
        this.set = set;
        this.map = map;
        this.properties = properties;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public List<String> getStrList() {
        return strList;
    }

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public void init() {
        System.out.println("初始化方法");
    }

    public void destroy() {
        System.out.println("销毁方法");
    }


    @Override
    public void save() {
        System.out.println(name + "------" + age);
        System.out.println(strList);
        System.out.println(set);
        System.out.println(map);
        System.out.println(properties);
        System.out.println(userList);
        System.out.println(userSet);
        System.out.println("我爱莉莉安");
    }
}