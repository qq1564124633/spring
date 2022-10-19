package com.lym.service.imp;

import com.lym.dao.UserDao;
import com.lym.service.UserService;

/**
 * @author liyumin
 * @date 2022/10/19 14:11
 */
public class UserServiceImpl implements UserService {
    private UserDao ud;

    public UserDao getUd() {
        return ud;
    }

    public void setUd(UserDao ud) {
        this.ud = ud;
    }

    @Override
    public void save() {
        ud.save();
    }
}
