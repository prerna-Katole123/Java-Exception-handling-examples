
public class finally_block {
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}
}

class Test {
	public void m1() {

		System.out.println("statement 1");
		System.out.println("statement 2");
		System.out.println("statement 3");

		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("cannot divide by zero");

		} finally {
			System.out.println("finally");
		}
	}
}
