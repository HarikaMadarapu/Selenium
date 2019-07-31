package Feb3rdweek2ndday;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HwDuplicateCharacter {

	public static void main(String[] args) {
		String s="harika";
		char[] chars = s.toCharArray();
		Map<Character,Integer> dup=new HashMap<Character,Integer>();
		for (char c : chars) {
			if(dup.containsKey(c)) {
				dup.put(c, dup.get(c)+1);
			}
			else {
				dup.put(c, 1);
			}
		}
System.out.println(dup);

Set<Character> after=dup.keySet();
for (Character ch : after) {
	if(dup.get(ch)>1) {
		System.out.println(ch);
	}
	
}

		
		
	}
}