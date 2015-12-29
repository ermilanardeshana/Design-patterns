package BuilderPattern;

import BuilderPattern.Burger.ChickenBurger;
import BuilderPattern.Burger.VegBurger;
import BuilderPattern.ColdDrink.Cokee;
import BuilderPattern.ColdDrink.Pepsi;

public class MealBuilder {

	public Meal prepareVegMeal(){
		Meal vegieeMeal = new Meal();
		vegieeMeal.addItem(new VegBurger());
		vegieeMeal.addItem(new Cokee());
		return vegieeMeal;
	}
	
	public Meal prepareChickenMeal(){
		Meal chickenMeal = new Meal();
		chickenMeal.addItem(new ChickenBurger());
		chickenMeal.addItem(new Pepsi());
		return chickenMeal;
	}
}
