package com.SSMTest.service.impl;

import com.SSMTest.dao.IUserDao;
import com.SSMTest.model.User;
import com.SSMTest.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class IUserServiceIpml implements IUserService {

   @Resource
    private IUserDao userDao;
    @Override
    public User selectUser(long id) {

        return userDao.SelectUser(id);
    }
}
