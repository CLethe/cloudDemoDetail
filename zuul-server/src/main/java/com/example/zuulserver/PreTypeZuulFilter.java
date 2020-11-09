package com.example.zuulserver;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_DECORATION_FILTER_ORDER;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

//@Component
public class PreTypeZuulFilter extends ZuulFilter {
    protected Logger logger = LoggerFactory.getLogger(PreTypeZuulFilter.class);

    /**
     * 过滤器类型
     * PRE_TYPE：在请求被路由之前调用，可用来实现身份验证、在集群中选择请求的微服务、记录调试信息等
     * ROUTING_TYPE：在路由 请求时被调用
     * POST_TYPE：在路由到微服务以后执行，可用来为响应添加标准的HTTP Header、收集统计信息和指标、将响应从微服务发送给客户端
     * ERROR_TYPE：在处理请求过程时发生错误时被调用
     * @return
     */
    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    /**
     * 返回执行顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return PRE_DECORATION_FILTER_ORDER - 1;
    }

    /**
     * 判断是否需要执行该过滤器
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 具体执行的过滤动作
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        this.logger.info("This is pre-type zuul filter.");
        return null;
    }
}
