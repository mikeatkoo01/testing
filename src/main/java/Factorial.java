
public class Factorial {

	public String reverse(double num) {
		int i = 1;
		
		while (num > 1) {		
			num /= ++i;
			
		}
		if (num == 1) return i + "!";
		else {
			return "NONE";
			
		}
		
	}
}
