package week1.assignment;

public class Sumall {

	public static void main(String[] args)
	{
		int sum = 0;
		int input = 1546;
		for(int i=0;i<=3;i++)
		{
			int rem = input % 10;					
			int num = input/10;
			input = num;				
			sum = sum +rem;
		}
		System.out.println(sum);


	}
}
