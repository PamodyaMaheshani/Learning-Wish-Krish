/*
 * Created by Pamodya Maheshani
 * Created on 12/12/2021
 * Class name : PizzaFactory
 * Committed and pushed to Learning-With-Krish repository
 */

package FactoryMethod;

public class PizzaFactory extends BasePizzaFactory{

	@Override
	public Pizza createPizza(String type) {
		
		Pizza pizza;		
		switch(type.toLowerCase()) 
		{
			case "cheese" :
				pizza = new CheesePizza();
				break;
			case "vege" :
				pizza = new VegePizza();
				break;
			case "pepperoni" :
				pizza = new PepperoniPizza();
				break;
			default: throw new IllegalArgumentException("No such pizza ..");
		}
		
		pizza.addIngredients();
		pizza.bakePizza();
		
		return pizza;
	}

}
