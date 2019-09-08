package week3.day1;

public abstract class  ICICIHeadOffice implements RBI,Cibil{
	
	public void setTransferLimit() {
System.out.println("100000");
		
	}

	public void setMinBalance() {
	System.out.println("5000");
	}
	
	public abstract void approval();
	


}
