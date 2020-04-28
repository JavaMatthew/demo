package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * 让FilterChain继承Filter这样我们可以在已有的FilterChain加入新的FilterChain而不是只能逐个Filter加入。
 * @Author Matthew
 * @Date 2019/6/16 16:06
 * @Version 1.0
 */

public class FilterChain implements Filter{
    List<Filter> filters = new ArrayList<>();

    public FilterChain addFilter(Filter filter) {
        this.filters.add(filter);
        return this;
    }

    public String doFilter(String string) {

        String r = string;

        for (Filter filter : filters) {
            r = filter.doFilter(r);
        }
        return r;
    }
}
