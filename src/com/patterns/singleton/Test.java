package com.patterns.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

//		DateUtil dateUtil = new DateUtil(); // This doesn't work as we made it private
		
		DateUtil dateUtil1 = DateUtil.getInstance(); 
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\TEJO SAI\\Desktop\\singleton\\dateUtil.ser")));
		oos.writeObject(dateUtil1);
		
		DateUtil dateUtil2 = null; 
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\TEJO SAI\\Desktop\\singleton\\dateUtil.ser")));
		dateUtil2 = (DateUtil) ois.readObject();
		
		oos.close();
		ois.close();
		
		
		System.out.println(dateUtil1);
		System.out.println(dateUtil2);
		System.out.println(dateUtil1==dateUtil2); // True since both are pointing at same memory location
		
	}

}
