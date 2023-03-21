package com.yc.usercenter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yc.usercenter.model.User;

/**
 * @author yc.liu
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     * @param userAccount 用户账号
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @return 用户id
     */
    long userRegister(String userAccount,String userPassword,String checkPassword);
}
