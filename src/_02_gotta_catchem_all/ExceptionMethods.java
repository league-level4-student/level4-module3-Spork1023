package _02_gotta_catchem_all;

public class ExceptionMethods {

	public Double divide(double x, double y) {
		Double ret;
		if(y == 0.0) {
			throw new IllegalArgumentException("y cant be 0");
		}
		else {
			ret = x*y;
		}
		return ret;
	}
	
	public String reverseString(String str) {
		String str2 = "";
		if(str.contentEquals("")) {
			throw new IllegalStateException("String cant be empty");
		}
		else {
		for(int i = str.length(); i > 0; i++) {
			str2 = str2 + str.charAt(i);
		}		
		}
		return str2;
	}
}
