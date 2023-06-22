package strings;

import java.util.HashMap;

//You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al".
//	The interpreted strings are then concatenated in the original order.
//Given the string command, return the Goal Parser's interpretation of command.
//
// 
//
// Example 1:
//
//Input: command = "G()(al)"
//Output: "Goal"
//Explanation: The Goal Parser interprets the command as follows:
//G -> G
//() -> o
//(al) -> al
//The final concatenated result is "Goal".





public class goalParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getParsedString("(G)()()()()()()()()(al)"));
		
	}
	
	public static String getParsedString(String s)
	{
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("G", "G");
		map.put("o","()");
		map.put("al", "(al)");
		
		
		StringBuilder st = new StringBuilder();
//		for(int i = 0; i<s.length();  )
//		{
//			if(s.charAt(i+1) =='G')
//			{
//				st.append("G");
//				i = i+3;
//				
//			}
//			else if(s.charAt(i+1)==')')
//			{
//				st.append('o');
//				i = i+2;
//			}
//			else if(s.charAt(i+1)=='a'&& s.charAt(i+2)=='l')
//			{
//				st.append("al");
//				i =i+4;
//			}
//			
//		}
		
		
		
		return st.toString();

	
		
		
		
	}
	
	

}
