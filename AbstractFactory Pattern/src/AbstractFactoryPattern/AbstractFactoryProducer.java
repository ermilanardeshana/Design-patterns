package AbstractFactoryPattern;

import ShapeFactory.ShapeFactory;
import ColorFactory.ColorFactory;

public class AbstractFactoryProducer {

	public static AbstractFactory getFactory(String factory){
		if(null == factory){
			return null;
		}
		if(factory.equalsIgnoreCase("Color")){
			return new ColorFactory();
		}else if(factory.equalsIgnoreCase("Shape")){
			return new ShapeFactory();
		}
		return null;
		
	}
}
