package com.cloudvalley.careerplus.web.controller.user;

import com.cloudvalley.careerplus.orm.base.User;
import com.cloudvalley.careerplus.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 用户控制器
 * Created by Eric on 15/6/4.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",method=RequestMethod.POST)
    @ResponseBody
    public Map<String,String> login(@RequestBody User user) throws IOException {
        User loginuser = userService.getUserByLoginName(user.getLoginName());
        Map<String,String> map = new HashMap<String, String>();
        if (loginuser != null) {
            System.out.println("user name = " + loginuser.getLoginName());
            if(loginuser.getLoginName().equals(user.getLoginName())){
                map.put("result","success");
            }else {
                map.put("result","false");
            }
        }
        return map;
    }
}
