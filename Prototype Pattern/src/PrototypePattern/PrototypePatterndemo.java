package PrototypePattern;

public class PrototypePatterndemo {

	public static void main(String[] args) {

		ShapeCache.loadCache();
		Shape clonedShape = ShapeCache.getShape("1");
		System.out.println("First shape type : " + clonedShape.getType());
		Shape clonedShape2 = ShapeCache.getShape("2");
		System.out.println("Second shape type : " + clonedShape2.getType());
		Shape clonedShape3 = ShapeCache.getShape("2");
		System.out.println("First shape type : " + clonedShape3.getType());
		Shape clonedShape4 = ShapeCache.getShape("3");
		System.out.println("First shape type : " + clonedShape4.getType());
	}

}
