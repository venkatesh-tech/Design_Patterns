//package com.patterns.singleton;
//
//import java.lang.reflect.Constructor;
//import java.lang.reflect.InvocationTargetException;
//
//public class RefectionProblem {
//
//	public static void main(String[] args) {
//		DateUtil instance1 = DateUtil.getInstance();
//		DateUtil instance2 = null;
//
//		Constructor[] declaredConstructor = DateUtil.class.getDeclaredConstructor();
//		for (Constructor constructor : declaredConstructor) {
//			constructor.setAccessible(true);
//			try {
//				instance2 = (DateUtil) constructor.newInstance(args);
//				break;
//			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
//					| InvocationTargetException e) {
//				e.printStackTrace();
//			}
//		}
//		System.out.println(instance1.hashCode());
//		System.out.println(instance2.hashCode());
//	}
//
//}
