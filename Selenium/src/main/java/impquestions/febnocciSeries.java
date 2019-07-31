package impquestions;

public class febnocciSeries {

	public static void main(String[] args) {
		int n1=0,n2=1,num=10;
		for(int i=0;i<=num;i++) {
			int sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.println(sum);
		}

	}

}
