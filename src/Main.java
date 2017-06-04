import java.util.Scanner;

/**
 * This class executes the program
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("List of available verbs:");
		ListOfVerbs listOfVerbs = new ListOfVerbs();
		listOfVerbs.displayList();
		Object input;
		String[] presentConj = null;
		String[] pastConj = null;

		// Prompt the user until a verb from the list is supplied
		String infinitive;
		do {
			System.out.println("Please choose a verb from the list by typing out the verb (eg. \"fragen\")");
			infinitive = new Scanner(System.in).next();
			System.out.println("");
		} while (listOfVerbs.isInList(infinitive) == false);

		// Determine which Object to instantiate depending on user input
		if (listOfVerbs.isRegular() == true) {
			input = new RegularVerb(infinitive);
			presentConj = ((RegularVerb) input).conjugatePresent();
			pastConj = ((RegularVerb) input).conjugatePast();

		} else if (infinitive.equals("haben")) {
			input = new VerbHaben();
			presentConj = ((VerbHaben) input).conjugatePresent();
			pastConj = ((VerbHaben) input).conjugatePast();
		} else {
			System.out.println("Oops, something went wrong. Please start the program again");
		}

		// Display the conjugated verb
		System.out.format("\"%s\" conjugated in the present tense is given as follows:\n", infinitive);
		new Display(presentConj);
		System.out.println("");

		System.out.format("\"%s\" conjugated in the past tense is given as follows:\n", infinitive);
		new Display(pastConj);
		System.out.println("");
	}
}
