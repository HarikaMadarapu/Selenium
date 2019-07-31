package Feb3rdweek2ndday;

import java.util.HashMap;
import java.util.Map;

public class OccOfEachChar {

	public static void main(String[] args) {
		String s="Harika";
		char[] c=s.toCharArray();
		
		
		 Map<Character,Integer> chars=new HashMap<Character, Integer>();
		for (char d : c) {
		if (chars.containsKey(d)) {
				chars.put(d, chars.get(d)+1);
			} else {
				chars.put(d, 1);
                
			}
		}
		System.out.println(chars);
	}

}
