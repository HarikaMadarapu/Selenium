package feb1stweek2ndday;

public class Palindrome {
	public static void main(String[] args) {
		String name="mom";
		String rev="";
		int length = name.length();
		
		//System.out.println(length);
		char[] Array=name.toCharArray();
		for(int i=Array.length-1;i>=0;i--) {
			
			rev=rev+Array[i];
			
		}
		System.out.println(rev);	
		
		if(name.equals(rev)) {
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
