package com.example.demo.controller;

/**
 * @Description TODO 此类可通过数据库调用需要被替换的垃圾词汇以及替换词汇
 * @Author Matthew
 * @Date 2019/6/16 10:38
 * @Version 1.0
 */

public class SensitiveFilter implements Filter {
    @Override
    public String doFilter(String string) {
        //process the sensitive words
        String r = string.replace("cnm", "***")
                .replace("敏感", "**");
        return r;
    }
}
