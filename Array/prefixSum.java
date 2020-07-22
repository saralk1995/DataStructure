import java.util.*;
public class prefixSum
{
	public static int getSum(int[] prefixSum,int l,int r)
	{	int sum = 0;
		if(l == 0)
		{
			sum = prefixSum[r];
		}
		else
			sum = prefixSum[r] - prefixSum[l-1];
		return sum;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] inputArray = {2,8,3,6,5,4};
		int[] prefixSum = new int[inputArray.length];
		prefixSum[0] = inputArray[0];
		for(int i=1;i<inputArray.length;i++)
		{
			prefixSum[i] = prefixSum[i-1] + inputArray[i];
		}
		int l = sc.nextInt();
		int r = sc.nextInt();
		int sum = getSum(prefixSum,l,r);
		System.out.println("the sum is " + sum);
	}
}