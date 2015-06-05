package com.cloudvalley.careerplus.orm.mapper;

import com.cloudvalley.careerplus.orm.base.User;
import org.apache.ibatis.annotations.*;

/**
 * 用户数据接口
 * Created by Eric on 15/6/4.
 */
public interface UserMapper {
    @Insert("insert into user(loginName, loginPwd, typeId) values(#{loginName},#{loginPwd},#{typeId})")
    void add(User user);

    @Select("select * from user where id = #{id}")
    User get(@Param("id") int id);

    @Select("select * from user where loginName = #{loginName}")
    User getByLoginName(@Param("loginName") String loginName);

    @Update("update user set loginName=#{loginName}, loginPwd=#{loginPwd}, typeId=#{typeId} where id=#{id}")
    void update(User user);

    @Delete("delete from user where id=#{id}")
    int delete(@Param("id") int id);
}
