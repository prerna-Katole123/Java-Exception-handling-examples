import java.util.Scanner;

public class illegalArgException {
	public static void main(String[] args) {
		System.out.println("enter number:");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();

		try {
			if (no < 0) {
				throw new IllegalArgumentException("value cannot be negative");
			} else {
				System.out.println("valid value:" + no);
			}
//illegal arg exception:It is used when a method receives an illegal or inappropriate argument.
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
