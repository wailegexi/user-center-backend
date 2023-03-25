package com.yc.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登陆请求体
 *
 * @author : yc.liu
 */
@Data
public class UserLoginRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 用户账号
     */
    private String userAccount;

    /**
     * 用户密码
     */
    private String userPassword;
}
