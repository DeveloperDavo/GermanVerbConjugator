
/**
 * This class takes conjugates the verb "haben" in the present and the past
 * tense. This is then displayed.
 */

public class VerbHaben implements Conjugate {
	private static final String infinitive = "haben";
    private String[] presentConj = new String[6];
    private String[] pastConj = new String[6];

	public VerbHaben() {
	}

	// Conjugate the verb in the present tense
	public String[] conjugatePresent() {

		presentConj[0] = "habe";
		presentConj[1] = "hast";
		presentConj[2] = "hat";
		presentConj[3] = infinitive;
		presentConj[4] = "habt";
		presentConj[5] = infinitive;

		return presentConj;
	}

	// Conjugate the verb in the past tense
	public String[] conjugatePast() {
		String pastTense = "gehabt";

		for (int i = 0; i < 6; i++) {
			pastConj[i] = presentConj[i] + " " + pastTense;

		}

		return pastConj;
	}

	// Test VerbHaben
	public static void main(String[] args) {
		VerbHaben haben = new VerbHaben();
		new Display(haben.conjugatePresent());
		new Display(haben.conjugatePast());
	}

}
