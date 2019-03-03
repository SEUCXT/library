package com.netease.library.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 17858 on 2019-03-03.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    private Logger logger = Logger.getLogger(TestController.class);

    @RequestMapping("/hello")
    @ResponseBody
    public  String HelloWorld(){
        for(int i=0;i<1000;i++){
            logger.debug("debug"+i);
            logger.info("info"+i);
            logger.warn("warn"+i);
            logger.error("error"+i);
            logger.fatal("fatal"+i);
        }
        return "Hello World!";
    }
}
