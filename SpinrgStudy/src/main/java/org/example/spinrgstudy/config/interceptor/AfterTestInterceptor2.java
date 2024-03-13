package org.example.spinrgstudy.config.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

@Slf4j
public class AfterTestInterceptor2 implements HandlerInterceptor {

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("AfterTestInterceptor2.afterCompletion:"+handler.getClass()+", ::"+handler);
        if("e".equals(request.getParameter("after"))){
            log.info("s::"+request.getParameter("after"));
            throw new Exception("AfterTestInterceptor2.afterCompletion Exception");
        }
    }
}
