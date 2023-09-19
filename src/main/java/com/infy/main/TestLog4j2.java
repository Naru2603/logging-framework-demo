package com.infy.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog4j2 {

	public static final Logger logger = LoggerFactory.getLogger(TestLog4j2.class);
//    public static final Logger logger = LogManager.getLogger(TestLog4j.class);

public static void myMain() {
	
	logger.info("TestLog4j2 = An INFO message");
    logger.debug("TestLog4j2 = A DEBUB message");
    logger.trace("TestLog4j2 = A TRACE message");
    logger.warn("TestLog4j2 = A WARN message");
    logger.error("TestLog4j2 = A ERROR message");
//    logger.fatal("A FATAL message");
	
    System.out.println("Run Complete TestLog4j2!!");
}

}
