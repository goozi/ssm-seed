package com.cloudvalley.careerplus.orm;

import com.cloudvalley.careerplus.orm.base.User;

/**
 * 抽象用户对象
 * 提供其他属性获取
 * Created by Eric on 15/6/4.
 */
public abstract class AbstractUser extends User {
    //获取当前用户所属分类名称
    public abstract String findTypeName();
}
