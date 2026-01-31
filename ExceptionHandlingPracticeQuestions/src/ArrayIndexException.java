
public class ArrayIndexException {
public static void main(String[] args) {
	int []arr= {1,3,4,5,6,7,8};
	
	try {
	System.out.println(arr[10]);
	}
	catch(ArrayIndexOutOfBoundsException ae)
	{
		System.out.println("invalid index");
	}
	catch (Exception e) {
		System.out.println("exception occured");
	}
}
}
