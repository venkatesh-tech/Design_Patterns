package com.patterns.abstractfactory;
// step 4
public class DBDaoFactory extends DaoAbstarctFactory {

	@Override
	public Dao createDao(String type) {
		Dao dao = null;
		if(type.equals("emp")) {
			dao = new DBEmpDao();
		}
		else if(type.equals("dept")) {
			dao = new DBDeptDao();
		}
		
		return null;	
	}

}
