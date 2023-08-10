package strings;

public class reverseString3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s));
	}

	
	public static String reverseWords(String s)
	{
		
		String[] words = s.split(" ");
		StringBuilder st2 = new StringBuilder();
		for(int i =0; i<words.length; )
		{
			
			
			StringBuilder st = new StringBuilder();
			for(int j = words[i].length() - 1 ; j>=0; j-- )
			{
				st.append(words[i].charAt(j));
			}
			if(i==words.length-1)
			{
			
			st2.append(st.toString());
			
			}
			else
			{
				st.append(" ");
				st2.append(st.toString());
				
				
			}
			i++;
		}
		return st2.toString();
		
	}
}

//class Solution {    Here I like the simple approach of using 2 funtions 1 for swapping
//                    and the other for building the string using stringbuilder and then
//                    using the trim function of the stringbuilder it seems easy.
//    public String reverseWords(String s) {        
//        String arr[] = s.split(" ");
//        StringBuilder sb = new StringBuilder();
//        for(String x : arr) {
//            sb.append(reverse(x)).append(" ");
//        }
//        return sb.toString().trim();
//    }
//    public String reverse(String s) {
//        int i = 0;
//        int j = s.length() - 1;
//        char arr[] = s.toCharArray();
//        while(i < j) {
//            char temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//        return new String(arr);
//    }
//}
