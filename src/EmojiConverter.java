import java.util.ArrayList;
import java.util.Scanner;

public class EmojiConverter {

	public static void main(String[] args) {
		ArrayList<String[]> conversions = new ArrayList<>();
		
		/**
		 * Emoticon conversions can be added/changed/removed below 
		 * by using the following format:
		 * 
		 * String[] conversionName = {"emoticon", "emoji"};
		 * conversions.add(conversionName);
		 * 
		 * Example:
		 * 
		 * String[] excited = {":D", "😃"};
		 * conversions.add(excited);
		 * 
		 */
		String[] happy = {":)", "☺"};
		conversions.add(happy);
		String[] sad = {":(", "☹"};
		conversions.add(sad);
		
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.print("Enter input you'd like converted: ");
			String str = scn.nextLine();
			for (String[] conversion : conversions) {
				str = str.replace(conversion[0], conversion[1]);
			}
			System.out.println("Here is the result:\n" + str);
			
			System.out.print("Type 'c' to continue converting, or anything else to quit: ");
			String response = scn.nextLine();
			if (!response.equals("c")) {
				break;
			}
		}
		
		scn.close();
		
	}

}
