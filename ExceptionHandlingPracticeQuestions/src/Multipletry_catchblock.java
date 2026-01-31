
public class Multipletry_catchblock {
	public static void main(String[] args) {
		demo d = new demo();
		d.m1();
	}
}

class demo {
	public void m1() {
		System.out.println("hello");
		try {
			System.out.println(10/0);
			try {
				
				System.out.println(20/0);
			}
			catch (ArithmeticException e) {
				System.out.println("cannot divide by zero");
			}
		}
		catch (ArithmeticException e) {
			System.out.println("cannot divide by zero");
		}
		finally {
			System.out.println("it always executes");
		}
	
}
}
