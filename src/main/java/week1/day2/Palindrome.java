package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String input = "refer",a="";
		char[] word = input.toCharArray();
		int length = word.length;
		System.out.println(length);
		for(int i=input.length()-1;i>=0;i--)
		{
			//	System.out.println(word[i]);
			a = a+word[i];
			System.out.println(a);
		}
		if(a.equals(input))
		{
			System.out.println("Palindrome");

		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
}


