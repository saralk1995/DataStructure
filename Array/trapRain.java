public class trapRain
{
	public static void printArray(int[] reverse)
	{
		for(int i=0;i<reverse.length;i++)
		{
			System.out.println(reverse[i]);
		}
	}
	public static int leftMaxCalculator(int[] arr,int i)
	{
		int leftMax = arr[0];
		for(int j=0;j<i;j++)
		{
			if(leftMax < arr[j])
				leftMax = arr[j];
		}
		return leftMax;

	}
	public static int rightMaxCalculator(int[] arr,int i)
	{
		int rightMax = arr[arr.length-1];
		for(int j=arr.length-1;j>i;j--)
		{
			if(rightMax < arr[j])
				rightMax = arr[j];
		}
		return rightMax;
	}
	public static void main(String args[])
	{
		//int[] arr = {3,0,1,2,5};
		int[] arr = {2,0,2};
		int[] leftMax = new int[arr.length];
		int[] rightMax = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			leftMax[i] = leftMaxCalculator(arr,i);
			rightMax[i] = rightMaxCalculator(arr,i);
		}
		// System.out.println("Left Max Array is");
		// printArray(leftMax);
		// System.out.println("Right Max Array is");
		// printArray(rightMax);
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(leftMax[i] > rightMax[i])
			{
				int temp = rightMax[i] - arr[i];
				if(temp<0)
					continue;
				sum = sum + temp;
			}
			else
			{
				int temp1 = leftMax[i] - arr[i];
				if(temp1<0)
					continue;
				sum = sum + temp1;
			}
		}
		System.out.println("total water trapped is" + sum);

	}
}