package com.guotie;

import com.guotie.filter.ScoreFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;

@SpringBootApplication
public class AppCotroller2 {
    public static void main(String[] args) {
        SpringApplication.run(AppCotroller2.class);
    }
    public FilterRegistrationBean getFilterBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new ScoreFilter());
        //bean.addUrlPatterns(new String[]{"*.do","*.jsp"});
        bean.addUrlPatterns("/hello");
        return bean;
    }
}
