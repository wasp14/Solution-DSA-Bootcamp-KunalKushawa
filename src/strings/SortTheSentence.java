package strings;

public class SortTheSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sortSentence("is2 sentence4 This1 a3"));
		
	}
	
	public static String sortSentence(String s)
	{
		
		String[] words = s.split(" ");
		
		String[] newSentence = new String[words.length];
		for(int i =0; i< words.length; i++)
		{
			newSentence[Character.getNumericValue(words[i].charAt(words[i].length()-1))-1] = words[i]; 
		}
		
		StringBuilder st = new StringBuilder();
	     for(int i =0 ; i< newSentence.length; i++)
	     {
	    	 if(i<newSentence.length-1)
	    	 {
	    	 st.append(newSentence[i].substring(0, newSentence[i].length()-1));
	    	 st.append(" ");
	    	 }
	    	 if(i==newSentence.length-1)
	    	 {
	    		 st.append(newSentence[i].substring(0, newSentence[i].length()-1));
	    		 
	    	 }

	    		 
	     }
		
	     return st.toString();
	}
}
