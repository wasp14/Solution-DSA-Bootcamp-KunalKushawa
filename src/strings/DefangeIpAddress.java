package strings;

public class DefangeIpAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(defangIpAddress("11.0.0.11....343.23.211324.3"));
		
	}
	
	
	public static String defangIpAddress(String address)
	{
		StringBuilder s = new StringBuilder();
		for(int i = 0; i<address.length(); i++)
		{
			if(address.charAt(i)=='.')
			{
				s.append("[.]");
			}
			else
				s.append(address.charAt(i));
		}
		String defanged = s.toString();
		return defanged;
	}

}
