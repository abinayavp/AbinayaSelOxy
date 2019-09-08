package week3.assignment;

import java.util.Map;
import java.util.TreeMap;

public class SecondRepeating {

	public static void main(String[] args) {
		String Name = "paypal india";
		char[] characters = Name.trim().toCharArray();
		Map<Character,Integer> e1 = new TreeMap<Character,Integer>();
		int length = characters.length;
		System.out.println(length);		

		for(int i=0;i<length;i++)
		{
			if(e1.containsKey(characters[i]))
			{	
			e1.put(characters[i], e1.get(characters[i])+1);

			}
			else
			{
				e1.put(characters[i], 1);		
			}

		}
		
  //   System.out.println(unique.keySet());
		for(Map.Entry<Character, Integer> m1:e1.entrySet()) {
		{
			
			if(m1.getValue()>1)
			{
				
			}
						
						
		}
	
	}

}

