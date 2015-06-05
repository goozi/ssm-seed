package com.cloudvalley.careerplus.service.po;

import com.cloudvalley.careerplus.orm.AbstractUser;
import com.cloudvalley.careerplus.orm.base.User;
import com.cloudvalley.careerplus.service.impl.UserService;

/**
 * Created by Eric on 15/6/4.
 */
public class UserPO extends AbstractUser {
    private final UserService userService;

    public UserPO(UserService userService) {
        this.userService = userService;
    }

    public UserPO copyFrom(User obj) {
        this.setId(obj.getId());
        this.setLoginName(obj.getLoginName());
        this.setLoginPwd(obj.getLoginPwd());
        this.setTypeId(obj.getTypeId());
        return this;
    }

    @Override
    public String findTypeName() {
        return userService.findTypeName(this.getTypeId());
    }
}
