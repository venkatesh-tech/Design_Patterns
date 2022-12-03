package com.patterns.abstractfactory;
// step 2
public class XMlEmpDao implements Dao{

	@Override
	public void save() {
		System.out.println("Saving Employee to XML");
	}
}
