package strings;

import java.util.HashMap;

public class DecryptString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s3 = "1326#";
		String s4 = "10#11#12";
		//System.out.println(decryptString(s4));
		int k = '1' - '0';
		System.out.println((char)(k+96));
		
	}

	public static String decryptString(String s)
	{
		StringBuilder st = new StringBuilder();
		if((s.length()>=2 && s.length()<=1000) )
		{
			HashMap<Character,Character> map = new HashMap<Character, Character>();
				map.put('1', 'a');
				map.put('2', 'b');
				map.put('3', 'c');
				map.put('4', 'd');
				map.put('5', 'e');
				map.put('6', 'f');
				map.put('7', 'g');
				map.put('8', 'h');
				map.put('9', 'i');
			HashMap<String,Character> map2 = new HashMap<String, Character>();
				map2.put("10#", 'j');
				map2.put("11#", 'k');
				map2.put("12#", 'l');
				map2.put("13#", 'm');
				map2.put("14#", 'n');
				map2.put("15#", 'o');
				map2.put("16#", 'p');
				map2.put("17#", 'q');
				map2.put("18#", 'r');
				map2.put("19#", 's');
				map2.put("20#", 't');
				map2.put("21#", 'u');
				map2.put("22#", 'v');
				map2.put("23#", 'w');
				map2.put("24#", 'x');
				map2.put("25#", 'y');
				map2.put("26#", 'z');
	
				
				
			for(int i =0; i< s.length();)
			{
				if((i<=s.length()-2  && i+2<s.length()) && s.charAt(i+2) =='#' )
				{
					st.append(map2.get(s.substring(i, i+3)));
					i = i+3;
				}
				else {
					st.append(map.get(s.charAt(i)));
					i =i+1;
				}
			}
			
		
		}
		return st.toString();
		
		
	}
	
	
	  public static String freqAlphabets(String s) {//Simpler Leetcode solution
	        StringBuilder sb = new StringBuilder();
	        
	        for(int i = s.length()-1; i >= 0; i--) {
	            int number;
	            if(s.charAt(i) == '#') { // If it is a two-digit number
	                number = (s.charAt(i-2) - '0') * 10 + (s.charAt(i-1) - '0');
	                i-=2;
	            } else { // If it is a single-digit number 
	                number = s.charAt(i) - '0';
	            }
	            // Convert the numeric value to its alphabetic representation
	            sb.append((char) (number + 96));
	        }

	        return sb.reverse().toString();
	    }
	
}
