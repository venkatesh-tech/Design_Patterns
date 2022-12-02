package com.patterns.factory;
// step 5
public class PizzaFactory {

	public static Pizza createPizza(String type) {
		Pizza p = null;

		if (type.equals("cheese")) {
			p = new CheesePizza();
		} else if (type.equals("chicken")) {
			p = new ChickenPizza();
		} else {
			p = new VegPizza();
		}

		return p;

	}

}
