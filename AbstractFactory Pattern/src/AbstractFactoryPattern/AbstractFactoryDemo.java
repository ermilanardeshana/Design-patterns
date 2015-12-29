package AbstractFactoryPattern;

import ColorFactory.IColor;
import ShapeFactory.IShape;

public class AbstractFactoryDemo {

	public static void main(String[] args) {

		AbstractFactory shapeFactory = AbstractFactoryProducer.getFactory("Shape");
		IShape shape = shapeFactory.getShape("Circle");
		shape.draw();
		
		AbstractFactory colorFactory = AbstractFactoryProducer.getFactory("color");
		IColor color = colorFactory.getColor("Red");
		color.fill();
//		AbstractFactoryProducer factoryProducer = new AbstractFactoryProducer();
//		AbstractFactory factory = factoryProducer.getFactory("Color");
//		factory.getColor("Red");
//		AbstractFactory factory2 = factoryProducer.getFactory("Shape");
	}

}
