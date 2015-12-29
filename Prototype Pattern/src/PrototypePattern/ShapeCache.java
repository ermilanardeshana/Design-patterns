package PrototypePattern;

import java.util.Hashtable;

public class ShapeCache {

	private static Hashtable<String, Shape> cacheShape = new Hashtable<String, Shape>();
	
	public static Shape getShape(String shapeID){
		Shape cachedShape = cacheShape.get(shapeID);
		return (Shape) cachedShape.Clone();
		
		
	}

	public static void loadCache(){
		Circle circle = new Circle();
		circle.setId("1");
		cacheShape.put("1", circle);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("2");
		cacheShape.put("2", rectangle);
		
		Square square = new Square();
		square.setId("3");
		cacheShape.put("3", square);
	}
}
