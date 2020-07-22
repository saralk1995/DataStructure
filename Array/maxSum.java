import java.util.*;
public class maxSum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] inputArray = {1,2,3,1,4,5};
		int max = 0;
		int sum = 0;
		for(int i=0;i<inputArray.length;i++)
		{
			sum = inputArray[i] + inputArray[i+1] +inputArray[i+2];
			if(sum > max)
				max = sum;
			if(i+2 == inputArray.length -1)
				break;
		}	
		System.out.println("The max sum is " + sum);
		
		
	}
}