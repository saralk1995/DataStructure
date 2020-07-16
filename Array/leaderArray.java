public class leaderArray
{
	public static void main(String[] args) {
		int[] arr = {5,3,20,15,8,3};
		int flag = 0;
		int max = arr[arr.length-1];
		System.out.println("Leader is " + max);
		for(int i=arr.length-2;i>0;i--)
		{
			if(arr[i] >= max)
			{	
				max = arr[i];
				System.out.println("Leader is " + max);
			}

		}

	}
}