package strings;

import java.util.Iterator;
import java.util.List;

public class CountItemsMatchingARule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] a = {1,2,3,4,5};
	int k = a.length;
	

	}

	public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue)
	{
		int count = 0;
		
		for(int i = 0; i< items.size(); i++)
		{
						
				switch(ruleKey) {
				case "type":
					if(ruleValue.equals(items.get(i).get(0)))
					{
						count++;
						break;
					};
				case "color":
					
						if(ruleValue.equals(items.get(i).get(1)))
						{
							count++;
							break;
						}
				case "name":
				
					if(ruleValue.equals(items.get(i).get(2)))
					{
						count++;
						break;
					}
			
			}
				
		}
		
		return count;	
		
	}
}
