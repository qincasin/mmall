package com.mmall.dao;

import com.mmall.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /*校验用户名是否存在*/
    int checkUsername(String username);

    /*校验email是否存在*/
    int checkEmail(String email);

    /*检查用户名和密码是否正确*/
    User selectLogin(@Param("username") String username,@Param("password") String password);

    /*通过用户名查找其对应的用户名问题*/
    String selectQuestionByUsername(String username);

    /*校验问题及问题答案*/
    int checkAnswer(@Param("username")String username,@Param("question")String question,@Param("answer")String answer);

    /*通过用户名修改密码  也就是重置密码*/
    int updatePasswordByUsername(@Param("username") String username,@Param("passwordNew") String passwordNew);

    /*登录状态下进行充值密码时保证当前登录人与修改密码人一致*/
    int checkPassword(@Param("password") String password,@Param("userId") Integer userId);

    //通过用户id校验当前的email是都跟以前的一样
    int checkEmailByUserId(@Param("email")String email,@Param("userId")Integer userId);



}