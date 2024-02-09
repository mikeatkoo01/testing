import java.util.ArrayList;
import java.util.List;

public class Doggo {

//	ArrayList<prizeDog> dog = new ArrayList();

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
//			System.out.println(convertToEng(i));

		}
	}

	public static String convertToEng(int number) {
		if (number < 1 || number > 100) {
			return "not allowed";
		}

		String[] units = { "0th", "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th" };
		String[] teens = { "", "11th", "12th", "13th" };
		String[] tens = { "", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

//		if statement for 100 and teens is need

		if (number == 100) {
			return "100th";

		} else if (number >= 11 && number <= 13) {
			return teens[number - 10];

		} else {
			return tens[number / 10] + units[number % 10];
		}
	}

//		number.removeIf(i = > (i % 3 == 0));

	public List<String> winner(int place) {
		List<String> placements = new ArrayList<String>();

		for (int i = 1; i <= 100; i++) {
			if (i == place)
				continue;
			System.out.println(placements);
		}

		return placements;
	}
}
