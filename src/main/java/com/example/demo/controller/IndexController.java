package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description TODO
 * @Author Matthew
 * @Date 2020/4/28 16:29
 * @Version 1.0
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(@RequestParam(name = "msg",required = false) String msg, Model model) {
        if (!StringUtils.isEmpty(msg)) {
            MsgProcessor msgProcessor = new MsgProcessor();
            msgProcessor.setMsg(msg);

            FilterChain filterChain = new FilterChain();
            filterChain.addFilter(new HTMLFilter())
                    .addFilter(new SensitiveFilter());
            FilterChain filterChain1 = new FilterChain();
            filterChain1.addFilter(new FaceFilter());
            filterChain.addFilter(filterChain1);

            msgProcessor.setFilterChain(filterChain);
            model.addAttribute("result", msgProcessor.process());
        }else {
            model.addAttribute("result", "此处显示过滤结果");
        }
        return "index";
    }

}
