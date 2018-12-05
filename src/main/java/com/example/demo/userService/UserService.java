package com.example.demo.userService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserService {
    private Logger logger = LoggerFactory.getLogger(UserService.class);

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("count") int count) throws Exception {
        logger.info("access provider 8081 as "+count);
        return "用户2号已登录";
    }
}
