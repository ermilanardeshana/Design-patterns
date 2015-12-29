package BuilderPattern.ColdDrink;

public class Pepsi extends ColdDrinks {

	@Override
	public String getName() {
		return "Pepsi drink";
	}

	@Override
	public float getPrice() {
		return (float) 1.50;
	}

}
