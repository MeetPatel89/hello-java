
public class ThrowExcep {
	
	static void fun() {
		try {
			throw new NullPointerException("Demo throwing null pointer exception...");
		}
		catch (NullPointerException e) {
			System.out.println("Caught inside fun()");
			throw e; // rethrowing the exception
		}
	}
	
	public static void main(String[] args) {
		try {
			fun();
		} 
		catch (NullPointerException e) {
			System.out.println("Caught in the main()");
			System.out.println(e.getMessage());
		}
	}
}
