import java.util.*;
public class reverseArray
{
	public static void printArray(int[] reverse)
	{
		for(int i=0;i<reverse.length;i++)
		{
			System.out.println(reverse[i]);
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] inputArray = {1,2,3,4,5};
		int[] reverseArray = new int[5];
		for(int i=0;i<inputArray.length;i++)
		{
			reverseArray[i] = inputArray[4-i];
		}
		printArray(reverseArray);
	}
}