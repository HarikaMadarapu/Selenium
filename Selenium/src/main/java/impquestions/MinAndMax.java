package impquestions;

import java.util.Arrays;

public class MinAndMax {

	public static void main(String[] args) {
		int[] array= {1,3,5,2,1,4,6};
		Arrays.sort(array);
	//for(int i=0;i<=array.length-1;i++) {
		System.out.println("min value is"+array[0]);
		System.out.println("max value is"+array[array.length-1]);
	}
		

	}


