package org.example.spinrgstudy.config.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
public class AllTestInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("AllTestInterceptor.preHandle:"+handler.getClass()+", ::"+handler);
        if("e".equals(request.getParameter("apre"))){
            log.info("s::"+request.getParameter("apre"));
            throw new Exception("AllTestInterceptor.preHandle Exception");
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("AllTestInterceptor.postHandle:"+handler.getClass()+", ::"+handler);
        if("e".equals(request.getParameter("apost"))){
            log.info("s::"+request.getParameter("a"));
            throw new Exception("AllTestInterceptor.postHandle Exception");
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("AllTestInterceptor.afterCompletion:"+handler.getClass()+", ::"+handler);
    }
}
