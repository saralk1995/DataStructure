import java.util.*;
public class nOccurences
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] inputArray = {10,10,21,431,5414,414};
		System.out.println("Number to be found");
		int n = sc.nextInt();
		int flag = 0;
		for(int i=0;i<inputArray.length;i++)
		{
			if(inputArray[i] == n)
				flag++;
		}
		System.out.println("Occureces are " + flag);
	}
}