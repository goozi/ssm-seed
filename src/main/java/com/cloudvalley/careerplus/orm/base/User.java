package com.cloudvalley.careerplus.orm.base;

/**
 * 用户对象
 * Created by Eric on 15/6/4.
 */
public class User {
    private int id;
    private String loginName;
    private String loginPwd;
    /**
     * 用户类型 1 管理员 2 普通用户
     */
    private int typeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }
}
