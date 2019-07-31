package interviewQuestions;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class DuplicateMethod3 {

	public static void main(String[] args) {
		Set<Integer> array = new HashSet<Integer>();
		int[] i= {1,3,7,3,8,8,9};
		for(int j=0;j<=6;j++) {
        boolean add = array.add(i[j]);
        if(add!=true) {
        	System.out.println("duplicate"+i[j]);
        	
        }
        
		}
	}

}
