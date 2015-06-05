package com.cloudvalley.careerplus.service.impl;

import com.cloudvalley.careerplus.orm.AbstractUser;
import com.cloudvalley.careerplus.orm.base.User;
import com.cloudvalley.careerplus.orm.mapper.UserMapper;
import com.cloudvalley.careerplus.service.IUserService;
import com.cloudvalley.careerplus.service.po.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Eric on 15/6/4.
 */
@Service
public class UserService implements IUserService {
    @Autowired
    private UserMapper userMapper;

    public void addSystemUser(String loginName, String loginPwd) {
        User user = new User();
        user.setLoginName(loginName);
        user.setLoginPwd(loginPwd);
        //用户类型 1 管理员 2 普通用户
        user.setTypeId(1);
        userMapper.add(null);
    }

    public void addNormalUser(String loginName, String loginPwd) {
        User user = new User();
        user.setLoginName(loginName);
        user.setLoginPwd(loginPwd);
        //用户类型 1 管理员 2 普通用户
        user.setTypeId(2);
        userMapper.add(null);
    }

    public AbstractUser getAbstractUserById(int userId) {
        User user = userMapper.get(userId);
        if (user != null) {
            UserPO po = new UserPO(this);
            po.copyFrom(user);
            return po;
        }
        return null;
    }

    public User getUserById(int userId) {
        return userMapper.get(userId);
    }

    public User getUserByLoginName(String loginName) {
        return userMapper.getByLoginName(loginName);
    }

    public void updateUser(int userId, String loginName, String loginPwd) {
        //先根据用户Id查询用户对象
        User user = userMapper.get(userId);
        if (user != null) {
            user.setLoginName(loginName);
            user.setLoginPwd(loginPwd);
            //修改用户
            userMapper.update(user);
        }
    }

    public int deleteUser(int userId) {
        return userMapper.delete(userId);
    }

    public String findTypeName(int typeId) {
        if (typeId == 1) {
            return "系统管理员";
        } else {
            return "普通用户";
        }
    }
}
