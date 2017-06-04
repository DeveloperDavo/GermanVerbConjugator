/**
 * This class defines the personal pronouns
 */
public class Display {
	private static final String[] personalPronouns = { "ich", "du", "er/sie/es", "wir", "ihr", "sie/Sie" };

	public Display(String[] conjugations) {
		for (int i = 0; i < 6; i++) {
			System.out.println(personalPronouns[i] + " " + conjugations[i]);
		}
	}

	// Test Display
	public static void main(String[] args) {
		VerbHaben haben = new VerbHaben();
		String[] presentConj = haben.conjugatePresent();
		new Display(presentConj);
		String[] pastConj = haben.conjugatePast();
		new Display(pastConj);

	}
}
