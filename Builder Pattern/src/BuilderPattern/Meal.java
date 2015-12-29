package BuilderPattern;

import java.util.ArrayList;

public class Meal {

	private ArrayList<Item> items = new ArrayList<Item>();

	public void addItem(Item item){
		items.add(item);
	}

	public float getCost(){
		float total=(float) 0.0;
		for(int i=0; i< items.size(); i++){
			total += items.get(i).getPrice();
		}
		return total;
	}

	public void showItems(){
		for (Item item : items) {
			System.out.print("Item : " + item.getName());
			System.out.print(", Packing : " + item.getPacking().pack());
			System.out.println(", Price : " + item.getPrice());
		}
	}
}
