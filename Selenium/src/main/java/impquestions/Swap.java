package impquestions;

public class Swap {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		System.out.println("before swap x:"+x);
		System.out.println("before swap y:"+y);
	
		/*x=x^y;
		y=x^y;
		x=x^y;*/
		/*x=x*y;
		y=x/y;
		x=x/y;*/
		x=x+y;
		y=x-y;x=x-y;
		System.out.println("after x"+x);
		System.out.println("after y"+y);
		

	}

}
