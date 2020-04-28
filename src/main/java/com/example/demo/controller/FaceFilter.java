package com.example.demo.controller;

/**
 * @Description TODO
 * 可按照不同版本的迭代设置不同的过滤器，不一定非要在数据库中提取，也可以认为后端设置枚举类，挨个过滤
 * @Author Matthew
 * @Date 2019/6/16 10:51
 * @Version 1.0
 */

public class FaceFilter implements Filter {
    @Override
    public String doFilter(String string) {
        return string.replace("呵呵", "^V^");
    }
}
