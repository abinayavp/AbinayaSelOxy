package week3.day1;

public class BSAcycle extends Bicycle{
	
	public void fillAir(String position)
	{
		System.out.println("Air filled");
	}
	
	public static void main(String args[])

	{
		BSAcycle bcycle = new BSAcycle();
		bcycle.fillAir("front");
		System.out.println("Understood Inheritance & Polymorphism");
	}
}
