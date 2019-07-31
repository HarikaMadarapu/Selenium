package impquestions;

public class ReadFromFile {

	public static void main(String[] args) {
		String name="$$ Welcome 2 ";
		char[] ch= name.toCharArray();
		int letter=0,space=0,num=0,special=0;
		for(int i=0;i<=name.length()-1;i++) {
			if(Character.isLetter(ch[i])){
				letter++;
			}
			else if(Character.isWhitespace(ch[i])) {
				space++;
			}
			else if(Character.isDigit(ch[i])) {
				num++;
			}
			else {
				special++;
			}
		
			System.out.println("$$ Welcome 2 ");
			System.out.println(letter);
			System.out.println(num);
			System.out.println(space);
			System.out.println(special);
				
		}
		
		

	}

}
