package com.byxx.ddsyj.Filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse res, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        // 指定允许其他域名访问
        response.setHeader("Access-Control-Allow-Origin", "*"); // 允许所有
        // response.setHeader("Access-Control-Allow-Origin", "http://127.0.0.1, http://locahost"); // 允许白名单IP
        // 响应类型
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        // 预检请求的结果缓存60分钟
        response.setHeader("Access-Control-Max-Age", "3600");
        // 响应头设置
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");

    }

    @Override
    public void destroy() {

    }
}
