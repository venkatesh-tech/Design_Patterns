package com.patterns.abstractfactory;
// step 5
public class DaoFactoryProducer {

	public static DaoAbstarctFactory produce(String factoryType) {
		DaoAbstarctFactory daf = null;

		if (factoryType.equals("xml")) {
			daf = new XMLDaoFactory();
		} else if (factoryType.equals("db")) {
			daf = new DBDaoFactory();
		}

		return daf;
	}
}
