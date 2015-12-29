package SingletonPattern;

public class SingletonClass {

	private static SingletonClass instance = new SingletonClass();
	private static int myPrice = 1;
	private SingletonClass(){
		
	}
	public static SingletonClass  getInstance(){
		return instance;
	}
	
	public void increasePriceOne(){
		myPrice++;
		System.out.println("MyPrice is "+ myPrice);
	}
	
}
