package week1.day2;

public class Uppercase {

	public static void main(String[] args) {

		String name = "AbiNaYa";		
		String replaceAll = name.replaceAll("[^A-Z]","");
		System.out.println(replaceAll);
	}

}
