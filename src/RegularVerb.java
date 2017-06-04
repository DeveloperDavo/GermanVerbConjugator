/**
 * This class takes a regular German verb as input and then conjugates the verb in the present and the past tense. 
 * This is then displayed.
 */

public class RegularVerb implements Conjugate {
	private String infinitive;
    private String verbTrunk;
    private Verb verb;

	public RegularVerb(String infinitive) {
		this.infinitive = infinitive;
        verbTrunk = infinitive.substring(0, infinitive.length() - 2);
        
	}

    // Conjugate the verb in the present tense
    public String[] conjugatePresent() {
        String[] conjugations = new String[6];

        conjugations[0] = verbTrunk + "e";
        conjugations[1] = verbTrunk + "st";
        conjugations[2] = verbTrunk + "t";
        conjugations[3] = infinitive;
        conjugations[4] = verbTrunk + "t";
        conjugations[5] = infinitive;

        return conjugations;
    }

    // Conjugate the verb in the past tense
    public String[] conjugatePast() {
        String[] conjugations = new String[6];

        String pastTense = "ge" + verbTrunk + "t";

        VerbHaben haben = new VerbHaben();
        String[] habenPresent = haben.conjugatePresent();

        for (int i = 0; i < 6; i++) {
            conjugations[i] = habenPresent[i] + " " + pastTense;
        }

        return conjugations;

    }
    
    // Test RegularVerb
 	public static void main(String[] args) {
         RegularVerb regularVerb = new RegularVerb("fragen");
		new Display(regularVerb.conjugatePresent());
		new Display(regularVerb.conjugatePast());
 	}
}
