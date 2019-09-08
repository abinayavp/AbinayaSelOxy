package week1.day1;

public class SumofOdd{


	public static void main(String[] args) {
		int sum = 0;
		for(int num = 1; num <= 100; num+=2)
		{
			int add = num + sum ;
			sum = num;
			System.out.println(add);
		}
		// TODO Auto-generated method stub

	}

}