package week1.assignment;

public class Changeme {

	public static void main(String[] args) {

		String text = "changeme";
		int lth = text.length();
		for(int i=0;i<=lth-1;i++)
		{
			char ch = text.charAt(i);
			if(i%2 != 0)
			{
				System.out.println(Character.toUpperCase(ch));
			}
			else
			{
				System.out.println(Character.toLowerCase(ch));
			}

		}		

	}

}
