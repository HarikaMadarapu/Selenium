package feb1stweek2ndday;

public class MulOfOddNumbers {

	private static int n;

	public static void main(String[] args) {
		int temp=1;
		int[] num= {1,2,3,4,5,6,7,8,9};
		for(int n:num)
		{
			if((n%2)!=0)
			temp=temp*n;
		}
		System.out.println(temp);


}

}
