package FactoryMethod;

public class SimplePizzaFactory {
	
	//use getPizzaType method to get object of type of Pizza
	public Pizza getPizzaType(String pizzaType) {
		
		if(pizzaType == null) {
			return null;
		}
		
		if(pizzaType.equalsIgnoreCase("cheese")) {
			return new CheesePizza();
		}
		else if(pizzaType.equalsIgnoreCase("vege")) {
			return new VegePizza();
		}
		else if(pizzaType.equalsIgnoreCase("pepperoni")) {
			return new PepperoniPizza();
		}
		
		return null;		
	}

}


