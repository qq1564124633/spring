package com.lym.service.serviceImpl;

import com.lym.dao.UserDao;
import com.lym.service.UserService;

/**
 * @author liyumin
 * @date 2022/09/13 16:53
 */
@SuppressWarnings({"all"})
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }
}

