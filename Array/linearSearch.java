import java.util.*;
public class linearSearch
{	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int inputNumber = sc.nextInt();
		int sizeofArray = sc.nextInt();
		int[] inputArray = new int[sizeofArray];
		int flag = 0;
		for(int i=0;i<sizeofArray;i++)
		{
			inputArray[i] = sc.nextInt();
		}
		for(int i=0;i<sizeofArray;i++)
		{
			if(inputArray[i] == inputNumber)
			{
				flag=1;
				break;
			}
				
		}
		if(flag==1)
			System.out.println("True");
		else
			System.out.println("False");
	}
}