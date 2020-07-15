import java.util.*;
public class kLargest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] inputArray = {1,2,3,4,5};
		System.out.println("Enter k largest");
		int max = 0;
		int flag = 0;
		int kLargest = sc.nextInt();
		Arrays.sort(inputArray);		
		int x = inputArray.length-kLargest+1;
		System.out.println("K largest element is " + x);
	}
}