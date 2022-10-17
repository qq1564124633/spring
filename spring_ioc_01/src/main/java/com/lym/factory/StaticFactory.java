package com.lym.factory;

import com.lym.dao.UserDao;
import com.lym.dao.impl.UserDaoImpl;

/**
 * @author liyumin
 * @date 2022/09/13 16:20
 * 工厂静态方法实例化
 */
public class StaticFactory {
    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
