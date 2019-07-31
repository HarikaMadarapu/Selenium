package feb3rdweek1stday;

public class RepeatedChar {

	public static void main(String[] args) {
		String MyName="Harikarao";
		char[] name=MyName.toCharArray();
		int i=name.length;
		int count = 0;
		int now = 0;
		for(int j=0;j<i;j++)
		{
			char ch=MyName.charAt(j);
	//System.out.println(ch);
			for(int k=j+1;k<i;k++) {
				char ch1=MyName.charAt(k);
				if(ch==ch1){
					count=count+1;
					
				}
				int temp = 0;
				if(count>temp)
				{
					temp=count;
					now = j;
				}
				
			}
		}
		
System.out.println(name[now]);
	}

}
