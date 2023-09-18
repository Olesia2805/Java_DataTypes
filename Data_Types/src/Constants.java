
public class Constants {

	public static void main(String[] args) {
		
		//CALL constants
		final int TOUCHDOWN = 6;
		final int CONVERSION = 1;
		final int FIELDGOAL = 3;
		
		int td, pat, fg, total;

		td = 4 * TOUCHDOWN; // 4 * 6 = 24
		pat = 3 / CONVERSION; // 3 / 1 = 3
		fg = 9 - FIELDGOAL; // 9 - 3 = 6
		total = (td + pat + fg); // 24 + 3 + 6 = 33
		
		System.out.println ("Total: " + total);
		
	}

}