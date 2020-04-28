package com.example.demo.controller;

/**
 * @Description TODO
 * 举例，其中一个过滤器
 * @Author Matthew
 * @Date 2019/6/16 10:34
 * @Version 1.0
 */

public class HTMLFilter implements Filter {
    @Override
    public String doFilter(String string) {
        // process the html tag <>
        String r = string.replace('<', '[')
                .replace('>', ']');
        return r;
    }
}
