import java.util.Arrays;

public class Plotter {

	// Variables
	private Boolean[] boolArray;
	
	// Constructor
	public Plotter() {
		boolArray = new Boolean[2];
	}
	
	public Plotter(int x, int y) {
		boolArray = new Boolean[2];
		System.out.println(getDirection(x, y));
	}
	
	
	// Methods
	public String getDirection(int x, int y) {
		if (x != 0) {
			boolArray[0] = x > 0 ? true : false;
		}
		if (y != 0) {
			boolArray[1] = y > 0 ? true : false;
		}
		
		System.out.println(Arrays.toString(boolArray));
		
		switch(Arrays.toString(boolArray).toLowerCase()) {
			case "[true, true]" : return "You are North-East.";
			case "[true, false]" : return "You are South-East";
			case "[false, true]" : return "You are North-West";
			case "[false, false]" : return "You are South-West";
			case "[false, null]" : return "You are directly East";
			case "[null, false]" : return "You are directly South";
			case "[true, null]" : return "You are directly West";
			case "[null, true]" : return "You are directly North";
			default : return "You are at Origin Point";
		}
		
	}
}
