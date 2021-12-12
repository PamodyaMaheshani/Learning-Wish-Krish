/*
 * Created by Pamodya Maheshani
 * Created on 11/12/2021
 * Class name : ColorFactory
 * Committed and pushed to Learning-With-Krish repository
 */

package AbstractFactory;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		
		if(color.equalsIgnoreCase("RED")) {
			return new Red();
		}
		else if(color.equalsIgnoreCase("GREEN")) {
			return new Green();
		}
		else if(color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		else {
			return null;
		}
	}

	@Override
	public Shape getShape(String type) {
		// TODO Auto-generated method stub
		return null;
	}

}
