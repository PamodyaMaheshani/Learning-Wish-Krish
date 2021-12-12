/*
 * Created by Pamodya Maheshani
 * Created on 12/12/2021
 * Class name : FactoryMain
 * Committed and pushed to Learning-With-Krish repository
 */

package FactoryMethod;

public class FactoryMain {

	public static void main(String[] args) {
		
		BasePizzaFactory pizaFactory = new PizzaFactory();
		
		Pizza cheesePizza = pizaFactory.createPizza("cheese");
		System.out.println(" ");
		
		Pizza vegePizza = pizaFactory.createPizza("vege");
		System.out.println(" ");
		
		Pizza pepperoniPizza = pizaFactory.createPizza("pepperoni");
		System.out.println(" ");
		
		//Pizza none = pizaFactory.createPizza("non");
	}

}
