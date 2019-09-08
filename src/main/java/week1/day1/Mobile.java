package week1.day1;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class Mobile {
	
	public long getNumber() {
		return 9787870520L;
	}

	public void myMobileSwitchedOff() {
		System.out.println("My mobile is switched off");
	}

	public String sendText() {
		return "I am good";
	}

	public Boolean smartPhone() {
		return true;
	}
	public float mobilePrice()
	{
		return 10000.500F;
	}
	public String mobModel()
	{
		return "Honor";
	}
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.myMobileSwitchedOff();
		long Number = m1.getNumber();
		System.out.println(Number);
		String Text = m1.sendText();
		System.out.println(Text);
		Boolean Option = m1.smartPhone();
		System.out.println(Option);
		Float Price = m1.mobilePrice();
		String Model = m1.mobModel();
		System.out.println(Model);
			}
}
