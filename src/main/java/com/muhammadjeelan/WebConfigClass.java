package com.muhammadjeelan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "com.muhammadjeelan" })
public class WebConfigClass extends WebMvcConfigurerAdapter {
 
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/META-INF/static/");
        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/META-INF/css/");
        registry.addResourceHandler("/folder/**").addResourceLocations("classpath:/META-INF/folder/");
        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/META-INF/js/");
    }
 
}