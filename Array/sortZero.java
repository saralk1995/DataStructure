import java.util.*;
public class sortZero
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] inputArray = {0,0,0,1,1,0,2,2,2,2};
		int flag = 0;
		int countZero = 0;
		int countOne = 0;
		int countTwo = 0;
		int[] outputArray = new int[10];
		for(int i=0;i<inputArray.length;i++)
		{
			if(inputArray[i] == 0)
				countZero++;
			if(inputArray[i] == 1)
				countOne++;
			if(inputArray[i] == 2)
				countTwo++;
		}
		int i = 0;
		for(i=0;i<outputArray.length;i++)
		{
			outputArray[i] = 0;
			flag++;
			if(flag == countZero)
				break;
		}
		flag = 0;
		for(++i;i<outputArray.length;i++)
		{
			outputArray[i] = 1;
			flag++;
			if(flag == countOne)
				break;
		}
		flag = 0;
		for(++i;i<outputArray.length;i++)
		{
			outputArray[i] = 2;
			flag++;
			if(flag == countTwo)
				break;
		}
		for(i=0;i<outputArray.length;i++)
		{
			System.out.println(outputArray[i]);
		}
		
	}
}