package week1.day1;

public class Operators {

	 int a = 5 ; int b = 10;
	 int add, sub, mul,div,mod;
		public int  myAddition()
		{
			add = a + b;
			return add;
		}
		public int mySubtraction()
		{
			sub = a - b;
			System.out.println(sub);
			return sub;
		}
		public int myMultiplication()
		{
			mul = a * b;
			System.out.println(mul);
			return mul;
		}
		public int myDivision()
		{
			div = a / b;
			System.out.println(div);
			return div;
		}
		public int myMod()
		{
			mod = a % b;
			System.out.println(mod);
			return mod;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Operators op = new Operators();
		System.out.println(op.myAddition());
		op.mySubtraction();
		op.myMultiplication();
		op.myDivision();
		op.myMod();
	}

}
