package FactoryMethod;

public class PizzaBigPackage extends PizzaPackages{

	@Override
	protected void createPizzaPackage() {
		
		pizza.add(new CheesePizza());
		pizza.add(new PepperoniPizza());
		pizza.add(new VegePizza());
	}

}