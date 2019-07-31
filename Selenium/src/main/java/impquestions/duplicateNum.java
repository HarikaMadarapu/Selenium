package impquestions;

public class duplicateNum {

	public static void main(String[] args) {
		int array[]= {1,3,3,7,8,8,9};
		int count=0;

		for (int i=0;i<7;i++) 
		{
			for(int j=i+1;j<7;j++) {
				if(array[i]==array[j]) {
					count=count+1;

					System.out.println(array[i]);
					System.out.println("num of times: " +count);
				}
			}
		}

	}


}


