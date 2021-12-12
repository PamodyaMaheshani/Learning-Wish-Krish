/*
 * Created by Pamodya Maheshani
 * Created on 12/12/2021
 * Class name : Pizza
 * Committed and pushed to Learning-With-Krish repository
 */

package FactoryMethod;

public abstract class Pizza {
	
	public abstract void addIngredients();
	
	public void bakePizza() {
		System.out.println("Pizza baked at 400 temperature for 20 minutes");
	}

}
