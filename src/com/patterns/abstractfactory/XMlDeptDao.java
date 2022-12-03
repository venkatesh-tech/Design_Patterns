package com.patterns.abstractfactory;
// step 2
public class XMlDeptDao implements Dao{

	@Override
	public void save() {
		System.out.println("Saving Department to XML");
	}
}
