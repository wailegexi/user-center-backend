package com.yc.usercenter.service;

import com.yc.usercenter.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 用户服务测试
 *
 * @author : yc.liu
 */
@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUserName("lyc");
        user.setUserAccount("dogwailegexi");
        user.setAvatarUrl("http");
        user.setGender(0);
        user.setUserPassword("123456");
        user.setPhone("18202490533");
        user.setEmail("123@qq.com");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertEquals(true, result);
    }

    @Test
    void userRegister() {
        String userAccount = "wailegexi";
        String userPassword = "";
        String checkPassword = "123456";
        long result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
        userAccount = "yc";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
        userAccount = "wailegexi";
        userPassword = "123456";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
        userAccount = "waile gexi";
        userPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
        checkPassword = "123456789";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
        userAccount = "dogwailegexi";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
        userAccount = "wailegexi";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertTrue(result > 0);
    }

}