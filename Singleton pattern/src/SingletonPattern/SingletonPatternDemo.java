package SingletonPattern;

public class SingletonPatternDemo {

	public static void main(String[] args) {

		SingletonClass instance = SingletonClass.getInstance();
		instance.increasePriceOne();
		instance.increasePriceOne();
	}

}
