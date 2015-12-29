package ShapeFactory;

import AbstractFactoryPattern.AbstractFactory;
import ColorFactory.IColor;

public class ShapeFactory extends AbstractFactory {

	public IShape getShape(String shapeType){
		if(null == shapeType){
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		}
		return null;
	}

	@Override
	public IColor getColor(String color) {
		return null;
	}
	
}
