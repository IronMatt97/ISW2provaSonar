package provaPackage;

import java.util.logging.Logger;
import java.util.logging.Level; 

public class Hello {
	
	static Logger logger = Logger.getLogger(Hello.class.getName());
	
	public static void main(String[] args) {

	logger.log(Level.INFO,"Hello world");

	}
}
