package impquestions;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = s.nextInt();
		int temp = 0;
		for(int i=2;i<n;i++) {
            temp=0;
			if(n%i==0) {
				temp=temp+1;
			}
		}

		if(temp==0) {
			System.out.println("it is prime");
		}
		else {
			System.out.println("it is not prime");
		}
	}
}

