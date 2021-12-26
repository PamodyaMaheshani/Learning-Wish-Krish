/*
 * Created by Pamodya Maheshani
 * Created on 11/12/2021
 * Class name : FactoryProducer
 * Committed and pushed to Learning-With-Krish repository
 */

package AbstractFactory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String choice) {
		
		if(choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		}
		else if(choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		else {
			return null;
		}
	}

}
