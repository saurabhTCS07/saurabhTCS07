package singleton;

public class Logger {

	public static Logger logger;
	
	private Logger() { // creation of private constructor is necessary
		
	}
	public static Logger getInstance() {
		
		if(logger == null) {
			logger = new Logger();
		}
		return logger;
	}
}
