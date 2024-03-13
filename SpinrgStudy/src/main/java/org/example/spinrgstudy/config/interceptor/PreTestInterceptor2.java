package org.example.spinrgstudy.config.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

@Slf4j
public class PreTestInterceptor2 implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("PreTestInterceptor2.preHandle:"+handler.getClass()+", ::"+handler);

        if("e".equals(request.getParameter("pre2"))){
            log.info("s::"+request.getParameter("pre2"));
            throw new Exception("PreTestInterceptor2.preHandle Exception");
        }

        return true;
    }

}
