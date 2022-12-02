package com.patterns.singleton;

public class TestEnumSingleton {

	public static void main(String[] args) {
		
		EnumSingletonDemo instance = EnumSingletonDemo.INSTANCE;
		System.out.println(instance.getName()); 
		instance.setName("Venkatesh");
		System.out.println(instance.getName()); 
		
	}

}
