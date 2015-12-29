package ColorFactory;

import ShapeFactory.IShape;
import AbstractFactoryPattern.AbstractFactory;

public class ColorFactory extends AbstractFactory{

	public IColor getColor(String color){
		if(null== color){
			return null;
		}
		if(color.equalsIgnoreCase("RED")){
			return new Red();
		}else if(color.equalsIgnoreCase("WHITE")){
			return new White();
		}else if(color.equalsIgnoreCase("GREEN")){
			return new Green();
		}
		return null;
	}

	@Override
	public IShape getShape(String shape) {
		return null;
	}
}
