package com.cloudvalley.careerplus;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * Created by Eric on 15/6/4.
 */
public class InitLog4jServlet extends HttpServlet {
    public void init() throws ServletException {
        super.init();
        org.apache.ibatis.logging.LogFactory.useLog4JLogging();
        System.out.println("****************** Mybatis 开始使用 log4j******************");
    }
}
