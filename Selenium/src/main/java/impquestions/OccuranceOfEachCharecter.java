package impquestions;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

public class OccuranceOfEachCharecter {

	public static void main(String[] args) {
		String name="harika";
		char[] array=name.toCharArray();
		Map<Character,Integer> charmap=new HashMap<Character, Integer>();
		for (char c : array) {
			if(charmap.containsKey(c)) {
				charmap.put(c,charmap.get(c)+1);
			}
			else {
				charmap.put(c,1);
			}
		}
		System.out.println(charmap);
	}

}
