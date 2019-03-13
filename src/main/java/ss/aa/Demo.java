package ss.aa;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Level;
//com.clc.java.clcMavenDemo.Demo  %C
import org.apache.log4j.Logger;

import java.util.logging.Logger;

public class Demo {
public static Logger logger = Logger.getLogger(Demo.class);
	
	public static void main(String[] args) throws InterruptedException {
		for (int i =0 ;i<1000;i++){
				logger.setLevel(Level.ALL);
				logger.trace("This is trace message");
				logger.trace("This is trace message");
				logger.trace("This is trace message");
				logger.error("This is error message");
				logger.warn("This is warn message");
				logger.info("This is info message");
				logger.fatal("This is fatal message");
				logger.debug("This is debug message");
				logger.trace("This is trace message");
				TimeUnit.SECONDS.sleep(3);
		}
		
		
		//m1(10);
	}

	private static void m1(int inputParam) {
		logger.info("inside main started..."+inputParam);
		
		int num = inputParam*10*10;
		logger.warn("inside main Completed..."+num);

		
	}


}
