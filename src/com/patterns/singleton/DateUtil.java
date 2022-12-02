package com.patterns.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable,Cloneable{

	private static final long serialVersionUID = 1L;
	private static volatile DateUtil instance; // step 3

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
	
	protected Object readResolve() {
		return instance;
	}

	@Override  // To prevet objects from cloning
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
