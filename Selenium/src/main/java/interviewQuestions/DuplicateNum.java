package interviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNum {

	public static void main(String[] args) {
		
		int array[]= {1,3,3,7,8,8,9};
		Set<Integer> arrayset=new HashSet<Integer>();
		int count=0;
		for(int i=0;i<=6;i++) {
			for(int j=i+1;j<=6;j++) {
				if(array[i]==array[j]) {
					 arrayset.add(array[i]);

					//System.out.println(array[i]);
					//System.out.println("num of times: " +count);
				}
			}
		}
				
					System.out.println(arrayset);
				}
				/*if(count>=1) {
					System.out.print(array[i]+" ");
					count=0;
				}*/
			
		

	}


