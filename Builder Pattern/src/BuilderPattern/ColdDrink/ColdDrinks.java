package BuilderPattern.ColdDrink;

import BuilderPattern.Item;
import BuilderPattern.Packing;

abstract class ColdDrinks implements Item {

	@Override
	public abstract float getPrice();

	@Override
	public Packing getPacking() {
		// TODO Auto-generated method stub
		return new BottleSealed();
	}

}
