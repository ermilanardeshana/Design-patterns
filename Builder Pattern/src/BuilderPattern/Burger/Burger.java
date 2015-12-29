package BuilderPattern.Burger;

import BuilderPattern.Item;
import BuilderPattern.Packing;

public abstract class Burger implements Item {

	@Override
	public abstract float getPrice();
	
	@Override
	public Packing getPacking() {
		return new Wrapper();
	}

}
