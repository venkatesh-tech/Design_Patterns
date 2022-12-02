package com.patterns.factory;
// step 3
public class PizzaStore {
	
	public Pizza orderPizza(String type) {
		Pizza p = null;
		
		if(type.equals("cheese")) {
			p = new CheesePizza();
		}else if(type.equals("chicken")) {
			p = new ChickenPizza();
		}else {
			p = new VegPizza();
		}
		
		p.prepare();
		p.bake();
		p.cut();
		
		return p;
	}
}
