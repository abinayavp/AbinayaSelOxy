package week3.assignment;

import java.util.LinkedHashMap;
import java.util.Map;

public class Duplicate {
	
	public static void main(String[] args) {
		String Name = "Infosys Limited";
		char[] characters = Name.trim().toCharArray();
		Map<Character, Integer> m1 = new LinkedHashMap<Character, Integer>();
		int length = characters.length;
		System.out.println(length);

		for (int i = 0; i < length; i++) {
			if (m1.containsKey(characters[i])) {
				m1.put(characters[i], m1.get(characters[i]) + 1);

			} else {
				m1.put(characters[i], 1);
			}

		}
		
		System.out.println(m1);

	for(Map.Entry<Character, Integer> e1:m1.entrySet()) {
		
	//	System.out.println(e1.getKey());
		//System.out.println(e1.getValue());
		if(e1.getValue()!=1)
		{
			System.out.println(e1.getKey());
		}
	}
	
	

	}

}



