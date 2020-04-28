package com.example.demo.controller;

/**
 * @Description TODO
 * @Author Matthew
 * @Date 2019/6/16 10:23
 * @Version 1.0
 */

public class MsgProcessor {

    private String msg;
    FilterChain filterChain;

    public FilterChain getFilterChain() {
        return filterChain;
    }

    public void setFilterChain(FilterChain filterChain) {
        this.filterChain = filterChain;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    //过滤
    public String process() {
        return filterChain.doFilter(msg);
    }
}
