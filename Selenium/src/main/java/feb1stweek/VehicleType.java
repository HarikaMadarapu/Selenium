package feb1stweek;

public class VehicleType {
	//String vehicleType="2wheeler";
	

	public static void main(String[] args) {
		/*String vehicleType="2wheeler";
		// TODO Auto-generated method stub
		if(vehicleType.equals("2wheeler") ){
			System.out.println("it is 2wheeler");
		}
		if(vehicleType.equals("4wheeler")) {
			System.out.println("it is 4 wheeler");
			if(vehicleType.equals("3wheeler")) {
				System.out.println("it is 3 wheeler");
			}
			else {
				System.out.println("train");
			}
		}
	
}*/
	int Vehicle=5;
	String type = null;
	switch (Vehicle) {
	case 2:
		type= "twowheeler";
	break;
	case 3:
		type="auto";
		break;
	case 4:
		type="car";
		break;
	case 5:
		type="train";
		break;
	}
	System.out.println(type);
		}
	 
}


