package com.zry.timmer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 功能拓展
 */
@Configuration
public class MyConfig extends WebMvcConfigurerAdapter {

    /**
     * 视图控制器
     * @return
     */
    @Bean
    public MyConfig myMvcConfig() {
        MyConfig myMvcConfig = new MyConfig() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("checkout/index");
                registry.addViewController("/index.html").setViewName("checkout/index");
            }
        };
        return myMvcConfig;
    }

}
