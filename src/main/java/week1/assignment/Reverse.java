package week1.assignment;

public class Reverse {	

	public static void main(String[] args) {
		String input = "I am a Software Tester",a="",ans = "";
		String text;
		String[] word = input.split("\\s");
		int length = word.length;
		System.out.println(length);				
		for(int i=0;i<=length-1;i++)
		{
			text = word[i];
			if(i%2 != 0)
			{	
				for(int j=text.length()-1;j>=0;j--)
				{
					a = a+text.charAt(j);
					ans = ans+a;
					a ="";				
				}	
			}
			else
			{				
				ans = ans + text;

			}
		}
			System.out.println(ans);

	}
}








