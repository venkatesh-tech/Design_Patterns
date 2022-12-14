package com.patterns.abstractfactory;
// step 4
public class XMLDaoFactory extends DaoAbstarctFactory {

	@Override
	public Dao createDao(String type) {
		
		Dao dao = null;
		if(type.equals("emp")) {
			
			dao = new XMlEmpDao();
		}
		else if(type.equals("dept")) {
			dao = new XMlDeptDao();
		}
		
		return dao;
	}

}
