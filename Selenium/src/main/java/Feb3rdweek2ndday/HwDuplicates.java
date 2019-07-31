package Feb3rdweek2ndday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HwDuplicates {

	public static void main(String[] args) {
		String s="goodday";
		char[] ch=s.toCharArray();
		String after="";
Set<Character> chars=new LinkedHashSet<Character>();
for(int i=0;i<s.length();i++) {
	chars.add(ch[i]);
}
List<Character> list=new ArrayList<Character>();
list.addAll(chars);
for(int j=0;j<list.size();j++) {
	after=after+list.get(j);
}

System.out.println(after);
	}

}
