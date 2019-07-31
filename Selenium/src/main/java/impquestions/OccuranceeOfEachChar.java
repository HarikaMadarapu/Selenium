package impquestions;

public class OccuranceeOfEachChar {

	public static void main(String[] args) {
		String name="harika";
		char c=name.charAt(0);
		int count = 0;
		for(int i=0;i<=name.length()-1;i++) {
			//name.charAt(i);
			if(c==name.charAt(i)){
			count=count+1;	
			}
			
		}
		System.out.println(c+":"+count );
	}

}
