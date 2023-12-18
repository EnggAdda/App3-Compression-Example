package com.example.app3.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import jakarta.servlet.Filter;

@Configuration
public class GZIPFilterConfig {

    @Bean
    public FilterRegistrationBean<Filter> gzipFilter() {
        FilterRegistrationBean<Filter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new GZIPFilter());
        registrationBean.addUrlPatterns("/api/data"); // Define URL patterns to apply the filter
        return registrationBean;
    }
}

