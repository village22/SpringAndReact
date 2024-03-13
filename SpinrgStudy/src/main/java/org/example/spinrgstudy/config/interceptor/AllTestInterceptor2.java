package org.example.spinrgstudy.config.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
public class AllTestInterceptor2 implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("AllTestInterceptor2.preHandle:"+handler.getClass()+", ::"+handler);
        if("e".equals(request.getParameter("apre2"))){
            log.info("s::"+request.getParameter("apre2"));
            throw new Exception("AllTestInterceptor2.preHandle Exception");
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("AllTestInterceptor2.postHandle:"+handler.getClass()+", ::"+handler);
        if("e".equals(request.getParameter("apost2"))){
            log.info("s::"+request.getParameter("apost2"));
            throw new Exception("AllTestInterceptor2.postHandle Exception");
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("AllTestInterceptor2.afterCompletion:"+handler.getClass()+", ::"+handler);
    }
}
