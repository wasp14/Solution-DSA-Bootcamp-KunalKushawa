package strings;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("race a car"));
	}
	
	public static boolean isPalindrome(String s)
	{	//System.out.println(s.length());
		 boolean result = false;
		 //System.out.println(s);
	        StringBuilder st = new StringBuilder();
	        for(int i = 0; i<s.length(); i++)
	        { //System.out.println(s.charAt(i));
	            if(((s.charAt(i)<=122 && s.charAt(i)>=97) || (s.charAt(i)<=90 && s.charAt(i)>=65))  || ((s.charAt(i)<=57 && s.charAt(i)>=48)) )
	            {  //System.out.print(s.charAt(i));
	          //  System.out.print(" : "+(int)s.charAt(i)+" ");
	                if((s.charAt(i)<=90 && s.charAt(i)>=65))
	                {  	
	                st.append((char)(s.charAt(i)+32));
	               // System.out.print(" ");
	               // System.out.print((char)(s.charAt(i)+32));
	               // System.out.print(" : "+(s.charAt(i)+32));
	                }
	                else
	                {
	                st.append(s.charAt(i));
	               // System.out.print(s.charAt(i));
	               // System.out.print(" : "+(int)s.charAt(i));
	                }
	            }
	            //System.out.println();
	        }
	       // System.out.println(st.toString());
	       
	        String k = st.toString();
	       // System.out.println(k);
	        System.out.println(" before j value of st: "+st.toString());
	       String j = st.reverse().toString();
	       System.out.println(" after j value of st: "+st.toString());
	       System.out.println(" j "+j);
	     //   System.out.println(k.length());
	       // System.out.println(k);
	        if(j.equals(k))
	        result = true;

	        return result;


	}

}
