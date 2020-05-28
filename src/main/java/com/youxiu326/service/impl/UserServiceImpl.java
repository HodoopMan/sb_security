package com.youxiu326.service.impl;

import com.youxiu326.bean.User;
import com.youxiu326.repository.UserDao;
import com.youxiu326.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao usreDao;
    @Override
    public List<User> getUserByUserName(String username)  {
        return usreDao.findByUserName(username);
    }
}