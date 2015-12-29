package DesignPattern;

public class ShapeFactoryDemoMain {

	public static void main(String[] args) {
 
		ShapeFactory shapeFactory = new ShapeFactory();
		IShape shape = shapeFactory.getShape("Circle");
		shape.draw();
		IShape shape2 = shapeFactory.getShape("Rectangle");
		shape2.draw();
		IShape shape3 = shapeFactory.getShape("Square");
		shape3.draw();
	}

}
