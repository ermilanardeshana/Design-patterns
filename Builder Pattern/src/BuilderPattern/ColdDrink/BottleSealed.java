package BuilderPattern.ColdDrink;

import BuilderPattern.Packing;
public class BottleSealed implements Packing {
@Override
public String pack(){
	return "bottled the liquid";
};
}
