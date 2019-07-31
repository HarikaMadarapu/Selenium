package feb1stweek2ndday;

public class HwArmstronNumber {

	public static void main(String[] args) {
		int n=370;
		int num=n;
		int r,temp = 0;
		while(num!=0) {
			r=num%10;
			temp=temp+(r*r*r);
			num=num/10;
			
		}
			if(temp==n) {
				System.out.println("it is a armstrong");
			}
			else {
				System.out.println("not a armstrong");
			}
		}
		

	}


