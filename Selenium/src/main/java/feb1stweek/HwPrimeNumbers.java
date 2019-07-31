package feb1stweek;

public class HwPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=96;
		int i=2;
		int temp = 0;
		for(i=2;i<=num-1;i++)
		{
			if(num%i==0) {
				temp=temp+1;
			}
		}if(temp>0)
		{
			System.out.println("not a prime");
		}
		else {
			System.out.println(" a prime number");
		}
	}
}





