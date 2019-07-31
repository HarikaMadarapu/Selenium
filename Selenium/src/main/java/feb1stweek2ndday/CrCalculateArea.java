package feb1stweek2ndday;

public class CrCalculateArea {

	/*public int area(int a) {
	return a*a;	
	}
	public float area(float a,int b) {
		return a*b;	
		}
	public float area(int a,float b) {
		return 0.5f*a*b;
	}
	public static void main(String[] args) {
		CrCalculateArea cr=new CrCalculateArea();
		//cr.area(5);
		System.out.println(cr.area(4,4.1f));

	}
	 */
	public  CrCalculateArea(int a) {
		int s=a*a;
		System.out.println(s);
	}
	public  CrCalculateArea(float a,int b) {
		this(5);
		float s=a*b;
		System.out.println(s);
		
	}
	public  CrCalculateArea(int a,float b) {
		this(5.1f,4);
		float s=a*b;
		System.out.println(s);
	}
	public static void main(String[] args) {
		CrCalculateArea cr=new CrCalculateArea(5,4.2f);

	}	
}
