package week3.day1;

public class Bicycle {

	public void getcolor(String brand)
	{
		if(brand.equals("Ladybird"))
			System.out.println("Red");
		else
			System.out.println("Black");

	}

	public void getcolor(int no)
	{
		if(no==2)
			System.out.println("2 cycles");
		else
			System.out.println("1 cycle");

	}

	public void fillAir(String position)
	{
		if(position.equals("Front"))
			System.out.println("30");
		else
			System.out.println("35");
	}

	public static void main (String args[])
	{
		Bicycle cycle = new Bicycle();
		cycle.getcolor("Ladybird");
		cycle.getcolor(3);
		cycle.fillAir("Back");
	}

}

