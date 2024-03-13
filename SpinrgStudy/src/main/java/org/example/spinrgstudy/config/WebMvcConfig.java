package org.example.spinrgstudy.config;

import org.example.spinrgstudy.config.interceptor.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AllTestInterceptor()); // preHandle, postHandle, afterCompletion

        registry.addInterceptor(new PreTestInterceptor1()); // preHandle
        registry.addInterceptor(new AllTestInterceptor2()); // preHandle, postHandle, afterCompletion
        registry.addInterceptor(new PreTestInterceptor2()); // preHandle

        registry.addInterceptor(new PostTestInterceptor1()); // postHandle
        registry.addInterceptor(new PostTestInterceptor2()); // postHandle

        registry.addInterceptor(new AfterTestInterceptor1()); // afterCompletion
        registry.addInterceptor(new AfterTestInterceptor2()); // afterCompletion

    }
}
