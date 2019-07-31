package impquestions;

public class reverseOfAString {

	public static void main(String[] args) {
	/*//Method #1	String name="harika";
		//System.out.println(name.length());
		String temp="";
		char[] chars=name.toCharArray();
		//System.out.println(chars.length);
		for (int i=chars.length-1;i>=0;i--) {
			//temp=temp+name.charAt(i);
			//temp=temp+chars[i];
			System.out.print(chars[i]);
			
		}
		//System.out.println(temp);
*/		
		//Method 2:
		String name="harika";
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}
		
		
			
		
										
			
			
		
		
	}
		

}
