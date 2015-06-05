package com.cloudvalley.careerplus.service;

import com.cloudvalley.careerplus.orm.AbstractUser;
import com.cloudvalley.careerplus.orm.base.User;

/**
 * 用户服务接口
 * Created by Eric on 15/6/4.
 */
public interface IUserService {
    //添加系统管理员
    void addSystemUser(String loginName, String loginPwd);

    //添加普通用户
    void addNormalUser(String loginName, String loginPwd);

    //根据用户Id查询抽象用户
    AbstractUser getAbstractUserById(int userId);

    //根据用户Id查询用户
    User getUserById(int userId);

    //根据用户名来查询用户
    User getUserByLoginName(String loginName);

    //修改用户信息
    void updateUser(int userId, String loginName, String loginPwd);

    //根据用户Id删除用户
    int deleteUser(int userId);
}
