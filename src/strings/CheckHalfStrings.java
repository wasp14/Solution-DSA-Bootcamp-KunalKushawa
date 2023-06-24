package strings;

public class CheckHalfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(halfStrings("UoaUuIEIeaIOuoUUiAaEUIAUAAuEiUIUiUOeUUouIiiaoeiuioiOIosUoEUoIueAoAOUAiiOAUaIOeaoOUuueoOaoXMjkZDIvJlIQzQQUHHeIUZaUgNcflAvNPCTqbrIofxevHndldyTrwBDhLgQssEGmehKiDJLmRZxLzlaoYWQNyqDmU"));
	}
	
	
	public static boolean halfStrings(String s)
	{
		
		int count1 =0, count2=0;
		if((s.length()<=1000 && s.length()>=2) && (s.length()%2==0))
		{
			
		String s1 = s.substring(0, (s.length()/2));
		String s2 = s.substring((s.length()/2), s.length());
		System.out.println(s1);
		System.out.println(s2); 
		for(int i =0; i< s1.length(); i++)
		{
			switch(s1.charAt(i))
			{
			case 'a':
				count1 = count1+1;
				break;
			case 'e':
				count1 = count1+1;
				break;
			case 'i':
				count1 = count1+1;
				break;
			case 'o':
				count1 = count1+1;
				break;
			case 'u':
				count1 = count1+1;
				break;
			case 'A':
				count1 = count1+1;
				break;
			case 'E':
				count1 = count1+1;
				break;
			case 'I':
				count1 = count1+1;
				break;
			case 'O':
				count1 = count1+1;
				break;
			case 'U':
				count1 = count1+1;
				break;
			}
		}
		System.out.println(count1);
		
		for(int j =0; j< s1.length(); j++)
		{
			switch(s2.charAt(j))
			{
			case 'a':
				count2 = count2+1;
				break;
			case 'e':
				count2 = count2+1;
				break;
			case 'i':
				count2 = count2+1;
				break;
			case 'o':
				count2 = count2+1;
				break;
			case 'u':
				count2 = count2+1;
				break;
			case 'A':
				count2 = count2+1;
				break;
			case 'E':
				count2 = count2+1;
				break;
			case 'I':
				count2 = count2+1;
				break;
			case 'O':
				count2 = count2+1;
				break;
			case 'U':
				count2 = count2+1;
				break;
		
			}
		}
			
		}
		System.out.println(count1);
		System.out.println(count2);
		if(count1 == count2)
			return true;
		else 
			return false;
	}

}
