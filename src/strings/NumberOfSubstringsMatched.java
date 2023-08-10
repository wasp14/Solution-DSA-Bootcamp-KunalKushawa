package strings;

public class NumberOfSubstringsMatched {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int numberOfSubStrings(String[] subs, String word)
	{
		int count = 0;
		for(int i =0; i<subs.length; i++)
		{
			if(word.contains(subs[i]))
				count++;
			
		}
		return count;
		
	}

}
