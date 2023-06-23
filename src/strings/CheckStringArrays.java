package strings;

public class CheckStringArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] w = {"ab","c"};
		System.out.println(String.join("", w));

	}

	
	public static boolean checkStrings(String[] word1, String[] word2)
	{
		boolean check;
		
		StringBuilder st1 = new StringBuilder();
		for(int i =0; i< word1.length; i++)
		{
			st1.append(word1[i]);
		}
		
		StringBuilder st2 = new StringBuilder();
		for(int j =0; j< word2.length; j++)
		{
			st2.append(word2[j]);
		}
		
	
		
		if(st1.toString().equals(st2.toString()))
			check = true;
		else
			check = false;
		
		return check;
		
	}
}
