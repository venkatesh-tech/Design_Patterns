package com.patterns.abstractfactory;

public class Test {

	public static void main(String[] args) {
		DaoAbstarctFactory daf = DaoFactoryProducer.produce("xml");
		Dao dao = daf.createDao("emp");
		dao.save();
	}
}
