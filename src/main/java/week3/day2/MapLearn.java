package week3.day2;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;



public class MapLearn {

		public static void main(String[] args) {
		String Name = "Abinaya";
		char[] characters = Name.toCharArray();
		Map<Character,Integer> myName = new TreeMap<Character,Integer>();
		int length = Name.length();
		System.out.println(length);		
	for(int i=0;i<length;i++)
	{
		if(myName.containsKey(characters[i]))
		{	
			myName.put(characters[i], myName.get(characters[i])+1);
		
		}
		else
		{
			myName.put(characters[i], 1);
		}
	}
	for(Entry<Character,Integer> eachEntry : myName.entrySet())
	{
		System.out.println(eachEntry.getKey()+"-"+eachEntry.getValue());
	}
	}
	
}

		