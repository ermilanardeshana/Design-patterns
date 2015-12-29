package BuilderPattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {

	MealBuilder mealbuilder = new MealBuilder();
	Meal vegMeal = mealbuilder.prepareVegMeal();
	vegMeal.showItems();
	System.out.println("Total Cost : " +vegMeal.getCost());
	
	Meal chickenMeal = mealbuilder.prepareChickenMeal();
	chickenMeal.showItems();
	System.out.println("Total Cost : "+chickenMeal.getCost());
	}

}
