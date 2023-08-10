package strings;

import java.util.HashMap;

public class robotReturnToOrigin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String move = "DURDLDRRLL";
		String m = "LL";
		System.out.println(checkMoves(m));

	}

	public static boolean checkMoves(String moves)
	{
		
		boolean check = false;
	
		
		
		{
			HashMap<Character,Integer> map = new HashMap<Character,Integer>();
			
			for(int i =0; i<moves.length(); i++)
			{
				if(map.containsKey(moves.charAt(i)))
				{
					map.put(moves.charAt(i), map.get(moves.charAt(i))+1);
				}
				else
					map.put(moves.charAt(i), 1);
			}
			
			int countL ;
			int countR ;
			int countD ;
			int countU ;
		
			if(map.get('L')==null)
				countL = 0;
			else
			 countL = map.get('L');
			if(map.get('R')==null)
				countR = 0;
			else
			 countR = map.get('R');
			if(map.get('U')==null)
				countU = 0;
			else
			 countU = map.get('U');
			if(map.get('D')==null)
				countD = 0;
			else
			 countD = map.get('D');
			
			System.out.println(countL);
			System.out.println(countR);
			System.out.println(countU);
			System.out.println(countD);
			
			
			if(countL>0 && countR>0 && countD>0 && countL==countR && countD== countU)
				check = true;
			else if(countL == countR || countD == countU)
				check =true;
			

			
			
		}
		return check;
	}
	
}
