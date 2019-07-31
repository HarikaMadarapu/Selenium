package impquestions;

import java.util.Arrays;
import java.util.Collections;

public class MinAndMax2 {

	public static void main(String[] args) {
		int[] array= {1,3,4,1,2,6,7};
		int largest=array[0];
		int smallest=array[0];
		for (int i=0;i<array.length-1;i++) {
			if(array[i]>largest) {
				largest=array[i];
				}
			
			else if(array[i]<smallest) {
				smallest=array[i];
			//System.out.println(array[i]);
		}
			
		}
		System.out.println(smallest);
		System.out.println(largest);
		

	}

}
