package Feb3rdweek2ndday;

public class HwException {

	public static void main(String[] args) {
		try {
			int i=10/0;
			}
		catch(ArithmeticException ae) {
			System.out.println("Arithmetic Exception:Num cannot be divided by 0");
		}

	}

}
