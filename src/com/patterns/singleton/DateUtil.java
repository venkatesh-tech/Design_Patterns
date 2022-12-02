package com.patterns.singleton;

public class DateUtil {

	// Eager intilization -- Method -2
//	private static DateUtil instance = new DateUtil(); // step 3 
	
	private static DateUtil instance;
	
	// Static method blocks intilization -- Method -3
	// static blocks in java are executed when class is loaded into the memory 
	static {
		instance = new DateUtil();
	}

	private DateUtil() { // step 1

	}

	public static DateUtil getInstance() { // step 2

		// Lazy Initialization -- Method -1
//		if (instance == null) { // stpe 5                  
//			instance = new DateUtil(); // step 4
//		}
		

		return instance;
	}

}
