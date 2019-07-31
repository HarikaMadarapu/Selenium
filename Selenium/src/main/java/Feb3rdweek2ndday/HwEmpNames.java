package Feb3rdweek2ndday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.poi.ss.formula.functions.Replace;

public class HwEmpNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> empNames=new ArrayList<String>();
		List<String> after=new ArrayList<String>();
		empNames.add("nivetha");
		empNames.add("Anusha");
		empNames.add("harika");
		empNames.add("bibu");
		empNames.add("jaja");
		System.out.println(empNames);
		for (String after1 : empNames) {
			if(!after1.contains("j")) {
				String names=after1;
				after.add(names);

			}
		}

		Collections.sort(after);
		System.out.println(after);
	}

}
