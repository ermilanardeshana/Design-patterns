package AbstractFactoryPattern;

import ShapeFactory.IShape;
import ColorFactory.IColor;

public abstract class AbstractFactory {

	 public abstract IColor getColor(String color);
	 public abstract IShape getShape(String shape);
}
