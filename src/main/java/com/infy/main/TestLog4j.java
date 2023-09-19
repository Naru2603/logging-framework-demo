package com.infy.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog4j {

	public static final Logger logger = LoggerFactory.getLogger(TestLog4j.class);
	
	public static void main(String[] args) throws InterruptedException {

		long startTime = System.currentTimeMillis();
        long duration = 10 * 1000; // 30 seconds in milliseconds

        while (System.currentTimeMillis() - startTime < duration) {
        	
    		logger.info("An INFO message");
            logger.debug("A DEBUB message");
            logger.trace("A TRACE message");
            logger.warn("A WARN message");
            logger.error("A ERROR message");
//            logger.fatal("A FATAL message");
            
           

        }
        System.out.println("Run Complete..!!");
	}
}
