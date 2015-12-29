package BuilderPattern.Burger;

import BuilderPattern.Packing;

public class Wrapper implements Packing {
@Override
public String pack(){
	return "Wrapped the burger inside the silver foil";
};
}
