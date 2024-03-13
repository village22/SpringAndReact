package org.example.spinrgstudy.config.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
public class PreTestInterceptor1 implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("PreTestInterceptor1.preHandle:"+handler.getClass()+", ::"+handler);
        if("e".equals(request.getParameter("pre"))){
            log.info("s::"+request.getParameter("pre"));
            try{

                throw new Exception("PreTestInterceptor1.preHandle Exception pass");
            }catch (Exception e){
                log.error("강제오류를 패스",e);
            }
        }

        if("e".equals(request.getParameter("pre1"))){
            log.info("s::"+request.getParameter("pre1"));
                throw new Exception("PreTestInterceptor1.preHandle Exception");
        }
        return true;
    }

}
