/*
 * Created by Pamodya Maheshani
 * Created on 11/12/2021
 * Class name : AbstractFactoryMain 
 * Committed and pushed to Learning-With-Krish repository
 * The main class
 */

package AbstractFactory;

public class AbstractFactoryMain {
	
	// create variables if necessary - for the ease of use
	private static final String SHAPE = "SHAPE";
	private static final String CIRCLE = "CIRCLE";
	private static final String RECTANGLE = "RECTANGLE";
	private static final String SQUARE = "SQUARE";
	
	private static final String COLOR = "COLOR";
	private static final String RED = "RED";
	private static final String GREEN = "GREEN";
	private static final String BLUE = "BLUE";
	

	public static void main(String[] args) {
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory(SHAPE);
		Shape shape = shapeFactory.getShape(CIRCLE);
		shape.draw();
		
		FactoryProducer.getFactory(SHAPE).getShape(RECTANGLE).draw();
		FactoryProducer.getFactory(SHAPE).getShape(SQUARE).draw();
		
		FactoryProducer.getFactory(COLOR).getColor(RED).fill();
		FactoryProducer.getFactory(COLOR).getColor(GREEN).fill();
		FactoryProducer.getFactory(COLOR).getColor(BLUE).fill();
	}

}
