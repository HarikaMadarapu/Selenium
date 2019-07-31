package feb1stweek2ndday;

public class HwOddIndexUpperCase {
	
	public static void main(String[] args) {
		String s="harika";
		String array[]= {"h","a","r","i","k","a"};
		String var="";
		for(int i=0;i<=5;i++)
		{
			if(i%2==0) {
				
				var=array[i].toUpperCase();
				System.out.print(var);
			}
			else
			{
				System.out.print(array[i]);
			}
	}

}
}
