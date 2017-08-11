package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * 类说明：
 *
 * @author: Casin
 * @Create: 2017-07-04 9:53
 * @HOME: https://qincasin.github.io/
 */

public interface IUserService {
    ServerResponse<User> login(String username, String password);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String str,String type);

    /*密码提示信息的获取*/
    ServerResponse<String> selectQuestion(String username);

    /*校验密码提示信息是否正确*/
    ServerResponse<String> checkAnswer(String username,String question,String answer);

    /*未登录状态下忘记密码的重置密码功能*/
    ServerResponse<String> forgetRestPassword(String username,String passwordNew,String forgetToken);

    /*登录状态下忘记密码充值功能*/
    ServerResponse<String> resetPassword(String passwordOld,String passwordNew,User user);

    /*更新用户的信息*/
    ServerResponse<User> updateInformation(User user);

    /*获取用户的详细信息*/
    ServerResponse<User> getInformation(Integer userId);

    /*校验是否是管理员*/
    ServerResponse checkAdminRole(User user);
}
