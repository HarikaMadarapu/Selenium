package feb1stweek2ndday;

public class CrCompanyReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="IBM IPvt Ltd";
		String temp="";


		String[] st=name.split(" ");
		for(int i=0;i<=st.length-1;i++)
		{
			//System.out.println(st[i]);
			temp=temp+st[i];
		}
		//System.out.println(temp);
		char[] array=temp.toCharArray();
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
			/*if(array[0]=array[i])
			{
				count=count+1;
			}*/
			
			
		}

	}}
