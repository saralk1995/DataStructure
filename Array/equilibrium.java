import java.util.*;
public class equilibrium
{
	public static boolean findEquilibrium(int[] array,int sum)
	{	
		int lsum = 0;
		int rsum = 0;
		boolean result = false;
		for(int i=0;i<array.length;i++)
		{
			if(i==0)
				lsum = 0;
			else if(i == array.length-1)
				rsum = 0;
			else
				lsum = lsum + array[i-1];	
			rsum = sum - lsum - array[i];
			if(lsum == rsum)
			{
				result = true;
				break;
			}
			else
			{
				result = false;
			}
		}
		return result;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] inputArray = {4,2,2};
		int[] prefixSum = new int[inputArray.length];
		int total = 0;
		for(int i=0;i<inputArray.length;i++)
		{
			total = total + inputArray[i];
		}
		boolean result = findEquilibrium(inputArray,total);
		System.out.println(result);
	}
}