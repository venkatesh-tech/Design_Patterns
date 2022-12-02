package com.patterns.singleton;

public class DateUtil {

	private static DateUtil instance; // step 3

	private DateUtil() { // step 1

	}

	public static DateUtil getInstance() { // step 2

		if (instance == null) { // stpe 5
			instance = new DateUtil(); // step 4
		}

		return instance;
	}

}
