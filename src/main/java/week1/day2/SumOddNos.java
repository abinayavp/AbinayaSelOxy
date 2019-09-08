package week1.day2;

public class SumOddNos {

	public static void main(String[] args)
	{
		int sum = 0;
		int input = 4567;
		for(int i=0;i<=3;i++)
		{
			int rem = input % 10;					
			int num = input/10;
			input = num;
			
			if(rem%2 != 0)
			{
				sum = sum +rem;
				System.out.println(sum);
			}
		}
	}

}
