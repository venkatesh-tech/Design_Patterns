package com.patterns.abstractfactory;

// step3 
public abstract class DaoAbstarctFactory {
	
	public abstract Dao createDao(String type);
}
