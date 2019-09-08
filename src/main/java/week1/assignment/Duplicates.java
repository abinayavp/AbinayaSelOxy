package week1.assignment;

public class Duplicates {

	public static void main(String[] args) {

		int input[] = {1,2 ,22 ,23, 34, 44, 33, 34, 22, 1, 34};
		int length = input.length;
		for (int i = 0; i <= length-1; i++) {
			for (int j = i + 1; j < length; j++) 
			{
				if (input[i]==input[j]) 
				{
					System.out.println(input[i]);
				}

			}
		
		}
			
	}
}


