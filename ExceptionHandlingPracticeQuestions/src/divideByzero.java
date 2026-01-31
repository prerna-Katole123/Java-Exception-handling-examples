import java.util.Scanner;

public class divideByzero {
public static void main(String[] args) {
	int a,b,result;
	System.out.println("enter two numbers:");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	result=a/b;
	try {
	System.out.println(result);
	}
	catch (ArithmeticException e) {
		System.out.println("cannot divide by zero ");
	}
}
}
