package interviewQuestions;

public class FebnocciSeries {

	public static void main(String[] args) {
		int n=10;
		int f1=0;
		int f2=1;
		int sum;
		for(int i=0;i<=n;i++) {
			sum=f1+f2;
			f1=f2;
			f2=sum;
			System.out.println(sum);
		}

	}

}
