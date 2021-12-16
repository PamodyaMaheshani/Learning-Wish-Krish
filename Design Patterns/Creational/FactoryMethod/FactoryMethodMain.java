package FactoryMethod;

public class FactoryMethodMain {
	
	public static void main(String[] args) {
		
		SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
		
		//get an object of cheese pizza and call its addIngredients method.
	    Pizza pizza1 = simplePizzaFactory.getPizzaType("cheese");
	    pizza1.addIngredients();

	    //get an object of vege pizza and call its addIngredients method.
	    Pizza pizza2 = simplePizzaFactory.getPizzaType("vege");
	    pizza2.addIngredients();
	    
	    //get an object of pepperoni pizza and call its addIngredients method.
	    Pizza pizza3 = simplePizzaFactory.getPizzaType("pepperoni");
	    pizza3.addIngredients();
		
	}

}


