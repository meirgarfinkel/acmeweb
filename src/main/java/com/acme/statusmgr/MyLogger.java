package com.acme.statusmgr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public final class MyLogger {

    private void MyLogger(){}

    private static Logger logger = LoggerFactory.getLogger(MyLogger.class);

    public static void detailLogger(List<String> details) {

        logger.info("We got some details!! " + details);
    }
}
