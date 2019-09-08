package week1.day2;

public class PrimeNos {

	public static void main(String[] args) {

		int nos[] = {2,8,9,15,47,42,99};
		for(int a : nos)
		{
			if(a % 2 != 0)
			{
				System.out.println(a+" " +"is prime no");
			}
			else
			{
				System.out.println(a+" "+ "is even no");
			}

		}

	}

}
