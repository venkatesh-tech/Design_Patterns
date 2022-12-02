package com.patterns.singleton;

public class DateUtil {

	private static DateUtil instance; // step 3

	private DateUtil() { // step 1

	}

	public static DateUtil getInstance() { // step 2

		if (instance == null) {
			synchronized (DateUtil.class) { // Handling multiple threads
				if (instance == null) { // stpe 5 // Lazy Initialization
					instance = new DateUtil(); // step 4
				}
			}
		}

		return instance;
	}

}
