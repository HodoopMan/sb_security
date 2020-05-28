package com.youxiu326.service;

import com.youxiu326.bean.User;

import java.util.List;

public interface UserService {

    /**
     * 根据访问资源路径 查询资源对象
     * @param username 资源路径
     * @return
     */
    List<User> getUserByUserName(String username);

}
