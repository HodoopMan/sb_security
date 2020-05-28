package com.youxiu326.controller;

import com.youxiu326.bean.User;
import com.youxiu326.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Api(value = "userInfo", tags = {"用户管理"}, description = "用户用户信息管理")
public class UserController {
    @Autowired
    private UserService userservice;

    @RequestMapping(value = "/getUserByUsername", method = RequestMethod.POST)
    @ApiOperation(value = "添加")
    @ResponseBody
    public User getUser(String username){
        List<User> result = userservice.getUserByUserName(username);
        User userInfo =result.get(0);
        return userInfo;
    }
    /**
     * 简单注册功能
     * @param username
     * @param password
     * @return
     */
//    @PostMapping("/register")
//    @RequestMapping(value = "/getUser", method = RequestMethod.POST)
//    @ApiOperation(value = "添加")
//    public Map<String, Object> register(String username, String password) {
//        boolean userflag= userservice.checkUserByUsername(username);
//        if(!userflag){
//            orderService.register(username, passwordEncoder.encode(password));
//            return ResultVO.result(ResultEnum.SUCCESS, true);
//        }else{
//            return ResultVO.result(ResultEnum.RESFAILURE, false);
//        }
//    }

}
