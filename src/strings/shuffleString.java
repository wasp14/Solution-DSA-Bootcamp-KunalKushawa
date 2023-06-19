package strings;

public class shuffleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,0,4,5,2,3,8,7,6};
		System.out.println(shuffleString("Hi AllDev", a));
	}
	
	public static String shuffleString(String s, int[] indices)
	{
			
		char[] shuffle = new char[s.length()];
		for(int i =0; i<s.length(); i++)
		{
				shuffle[indices[i]] = s.charAt(i);
		}
	String st = new String(shuffle);
	return st;  
		
		
		
	}

}
