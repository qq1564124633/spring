package com.lym.factory;

import com.lym.dao.UserDao;
import com.lym.dao.impl.UserDaoImpl;

/**
 * @author liyumin
 * @date 2022/09/13 16:32
 * 工厂方法实例化
 */
public class DynamicFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
