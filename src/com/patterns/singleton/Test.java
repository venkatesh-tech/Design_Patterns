package com.patterns.singleton;

public class Test {

	public static void main(String[] args) {

//		DateUtil dateUtil = new DateUtil(); // This doesn't work as we made it private
		
		DateUtil dateUtil1 = DateUtil.getInstance(); 
		DateUtil dateUtil2 = DateUtil.getInstance(); 
		
		System.out.println(dateUtil1);
		System.out.println(dateUtil2);
		System.out.println(dateUtil1==dateUtil2); // True since both are pointing at same memory location
		
	}

}
