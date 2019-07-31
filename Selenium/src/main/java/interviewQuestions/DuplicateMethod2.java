package interviewQuestions;

import java.util.Arrays;

public class DuplicateMethod2 {

	public static void main(String[] args) {
		int[] array= {1,3,7,3,8,8,9};
		Arrays.sort(array);
		for(int i=0;i<array.length-1;i++) {
			if(array[i]==array[i+1]) {
				System.out.println("duplicate  " +array[i]);
			}
			else {
				//System.out.println("no duplicated");
			}
		}

	}

}
