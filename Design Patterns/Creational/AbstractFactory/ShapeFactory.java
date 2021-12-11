package AbstractFactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String type) {
		
		if(type == null) {
			return null;
		}
		else if(type.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		else if(type.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		else if(type.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		else {
			return null;
		}
	}

}
