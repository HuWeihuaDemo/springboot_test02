package com.guotie.filter;

import javax.servlet.*;
import java.io.IOException;

public class ScoreFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter启动");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("Filter离开");
    }

    @Override
    public void destroy() {

    }
}
