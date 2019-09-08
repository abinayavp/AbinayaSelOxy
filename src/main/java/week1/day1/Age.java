package week1.day1;

public class Age {
	
	
	public static void main(String[] args)
	{	
	int agegroup = 50;

//	System.out.println("Enter the age");
			
	if(agegroup<18)
	{
		System.out.println("Child");
	}
	else if((agegroup>=18)&& (agegroup<=59))
	{
		System.out.println("Adult");
	}
	else
	{
		System.out.println("Senior Citizen");
	}
	}
	
}
