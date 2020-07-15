import java.util.*;
public class minMax
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] inputArray = new int[size];
		int max = 0;
		int min = 0;
		for(int i=0;i<size;i++)
		{
			inputArray[i] = sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			if(i==0)
			{
				min = inputArray[0];
				max = inputArray[0];
			}
			if(inputArray[i] > max)
				max = inputArray[i];
			if(inputArray[i] < min)
				min = inputArray[i];
		}
		System.out.println("Max element is " + max);
		System.out.println("Min element is " + min);
	}
}