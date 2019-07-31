package Feb3rdweek2ndday;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateName {

	public static void main(String[] args) {
		List<String> str=new ArrayList<String>();
		str.add("harika");
		str.add("harika");
		str.add("java");
		str.add("selenium");
		str.add("king");
		str.add("king");
		Collections.sort(str);
		System.out.println(str);
		
Set<String> dupstr=new TreeSet<String>();

		dupstr.addAll(str);
		
System.out.println(dupstr);
	}

}
