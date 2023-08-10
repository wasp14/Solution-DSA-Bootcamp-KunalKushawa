package strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class longPressedName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "saeed";
		String typed = "ssaaedd";
		String name1 = "alex";
		String typed1 = "aaleex";
		System.out.println(isLongPressedName(name1, typed1));
		
	}

	public static boolean isLongPressedName(String name, String typed)
	{
		boolean isLong = false;
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		
		
		if((name.length()<=1000 && name.length()>=1) && (typed.length()<=1000 && typed.length()>=1))
		{
			
			for(int i =0; i<name.length(); i++)
			{
				if(map1.containsKey(name.charAt(i)))
				{
					map1.put(name.charAt(i), map1.get(name.charAt(i))+1);
				}
				else
					map1.put(name.charAt(i), 1);
			}
			
			for(int j =0; j<typed.length(); j++)
			{
				if(map2.containsKey(typed.charAt(j)))
				{
					map2.put(typed.charAt(j), map2.get(typed.charAt(j))+1);
				}
				else
					map2.put(typed.charAt(j), 1);
			}
			
			Set<Character> key1 = map1.keySet();
			
			Set<Character> key2 = map2.keySet();
			System.out.println(key1.toString());
			System.out.println(key2.toString());
			
			if(key1.size()!=key2.size())
				isLong = false;
			else if(key1.containsAll(key2))
			{
				boolean isSequential = false;
				
			for(int k =0 ; k<name.length(); k++)
			{
				if(map2.get(name.charAt(k)) < map1.get(name.charAt(k)))
				{	
					isLong = false;
					break;
				}
				else
				{
					isLong = true;
				}
			}
			
		}
			else
				isLong =false;
		}
		return isLong;
	}
}
