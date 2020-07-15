import java.util.*;
public class negativeElement
{
	public static void main(String args[])
	{
		int[] inputArray = {-1,2,3,4,-1,3,-4,21,91};
		int[] outputArray = new int[inputArray.length];
		int k=0;
		for(int i=0;i<inputArray.length;i++)
		{
			if(inputArray[i] < 0)
			{
				outputArray[k] = inputArray[i];
				k++;
			}
		}
		for(int i=0;i<inputArray.length;i++)
		{
			if(inputArray[i] > 0)
			{
				outputArray[k] = inputArray[i];
				k++;
			}
		}
		for(int j=0;j<inputArray.length;j++)
		{
			System.out.println(outputArray[j]);
		}
	}
}