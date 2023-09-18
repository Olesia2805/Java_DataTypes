
public class Data {

	public static void main(String[] args) {
		
		char letter = 'a';
		String title = "Java is easy";
		int num = 365;
		float decimal = 98.67f;
		boolean result = true;
		
		System.out.println("Letter: " + letter);
		System.out.println("Name: " + title);
		System.out.println("Number of days: " + num);
		System.out.println("Temperature: " + decimal);
		System.out.println("Answer: " + result);
		
		System.out.println(letter + num);
		System.out.println(letter + " "  + title);
		System.out.println(decimal + " "  + title);
		System.out.println(num + " " + title + " " + letter);
		System.out.println(letter + num + " " + title);
		System.out.println(result + " " + title);
		//System.out.println(result + num); => incorrect
		//System.out.println(result + letter); => incorrect
		
	}

}
