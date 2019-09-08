package week1.day2;

public class Duplicate {

	public static void main(String[] args) {

		String input = "koushik";
		for (int i = 0; i < input.length() - 1; i++) {
			char c = input.charAt(i);
			for (int j = i + 1; j < input.length() ; j++)
			{
				//System.out.println(input.charAt(j));
				if (c == input.charAt(j)) 
				{
					System.out.println(c);
				}

			}
		}

	}

}
