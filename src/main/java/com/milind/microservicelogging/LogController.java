package com.milind.microservicelogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by Milind on 24/11/17.
 */
@RestController
public class LogController {

    private  static Logger logger = LoggerFactory.getLogger(LogController.class);

    @RequestMapping(value = "/log", method = RequestMethod.GET)
    public String log() throws IOException {

        logger.trace(" This is Trace Logging");
        logger.debug(" This is Debug Logging");
        logger.info(" This is Info Logging");
        logger.error(" This is Error Logging");
        logger.warn(" This is Warn Logging");
        return "Done Logging at different level";
    }
}
