
public class Main {
	enum Level {
		low,
		medium,
		high
	}
	
	public static void main(String[] args) {
		System.out.println("Hello Java!");
		Dog dog = new Dog();
		System.out.println(Animal.randomOne);
		System.out.println(Level.medium);
		
	}
}

interface Animal {
	String randomOne = "Random One String";
	
	static String randomTwo = "Random static two string";
	
	static public void methodThree() {
		System.out.println("Hello method Three");
	}
	public default void methodOne() {
		System.out.println("Hello Abstraction!");
	}
	
	public default void methodTwo() {
		System.out.println("Hello method Two");
	}
}

class Dog implements Animal {
	
}
