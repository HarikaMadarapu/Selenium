package feb1stweek;

public class Vehicle {

String modelOfVehicle="honda";
char firstCharecter='h';
boolean Punctured=true;

public void applyBreak() {
	System.out.println("break applied");

}
public int getNumOfWheels(int n) {
	return n;
}
public boolean isPunctured() {
	return Punctured;
	
}
public static void main(String[] args) {
	Vehicle v=new Vehicle();
	v.applyBreak();
	//v.getNumOfWheels(4);
	int n=v.getNumOfWheels(4);
	System.out.println(n);
	boolean b=v.isPunctured();
	System.out.println(b);
	
}
}
