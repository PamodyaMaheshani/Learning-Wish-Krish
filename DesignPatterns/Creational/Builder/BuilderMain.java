package Builder;

public class BuilderMain {
	
	public static void main(String[] args) {
		
		MealBuilder mealBuilder = new MealBuilder();

		OrderMeal vegMeal = mealBuilder.prepareVegMeal();
	    System.out.println("Veg Meal");
	    vegMeal.showItems();
	    System.out.println("Total Cost: " + vegMeal.getCost());

	    OrderMeal nonVegMeal = mealBuilder.prepareNonVegMeal();
	    System.out.println("\n\nNon-Veg Meal");
	    nonVegMeal.showItems();
	    System.out.println("Total Cost: " + nonVegMeal.getCost());
	}

}
