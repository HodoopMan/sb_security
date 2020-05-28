package com.youxiu326.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Api(value = "api/random", tags = {"抽奖模块"}, description = "随机的控制层")
public class SecurityController {

    /**
     * 自定义登录界面
     * @return
     */
    @GetMapping(value = "/login")
    @ApiOperation(value = "自定义登录界面", notes = "根据用户名称，密码进行登录")
    @ApiImplicitParam(paramType = "query", name = "userId", value = "用户ID", required = true, dataType = "String")
    public String login(){
        return "login";
    }


    /**
     * admin角色可访问
     * @return
     */
    @GetMapping(value = "/adminPage")
    @ApiOperation(value = "admin角色可访问")
    public String adminPage(){
        return "adminPage";
    }
    /**
     * user角色可访问
     * @return
     */
    @GetMapping(value = "/userPage")
    @ApiOperation(value = "user角色可访问")
    public String userPage(){
        return "userPage";
    }
    /**
     * 所有人可访问
     * @return
     */
    @GetMapping(value = "//allPage")
    @ApiOperation(value = "所有人可访问")
    public String allPage(){
        return "/allPage";
    }

}