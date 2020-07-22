public class rotateArray
{
	public static void printArray(int[] reverse)
	{
		for(int i=0;i<reverse.length;i++)
		{
			System.out.println(reverse[i]);
		}
	}
	public static int[] reverseArray(int[] reverse,int start,int end)
	{
		int low = start;
		int high = end;
		while(low<high)
		{
			int temp = 0;
			temp = reverse[low];
			reverse[low] = reverse[high];
			reverse[high] = temp;
			low++;
			high--;
		}
		return reverse;
 	}
	public static void main(String args[])
	{
		int[] arr = {1,2,3,4,5};
		int d = 4;
		int[] reverseArray = new int[arr.length];
		reverseArray = reverseArray(arr,0,d-1);
		reverseArray = reverseArray(reverseArray,d,arr.length-1);
		reverseArray = reverseArray(arr,0,arr.length-1);
		printArray(reverseArray);

	}
}