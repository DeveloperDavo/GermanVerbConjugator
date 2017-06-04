import java.util.ArrayList;

/**
 * This class displays a verb and checks if the input is in the list of verbs
 */
public class ListOfVerbs {
	private static final ArrayList<Verb> verbs = new ArrayList<Verb>();
	private int index;

	// Fill array list of verbs
	public ListOfVerbs() {

		// Regular Verbs
		verbs.add(new Verb("fragen", true));
		verbs.add(new Verb("machen", true));
		verbs.add(new Verb("glauben", true));
		verbs.add(new Verb("leben", true));
		verbs.add(new Verb("lernen", true));
		verbs.add(new Verb("reden", true));
		verbs.add(new Verb("sagen", true));
		verbs.add(new Verb("spielen", true));

		// Help Verbs
		verbs.add(new Verb("haben", false));
	}

	public ArrayList<Verb> getList() {
		return verbs;
	}

	// Check if input verb is in list of verbs
	public boolean isInList(String inputVerb) {
		boolean inList = false;
		for (index = 0; index < verbs.size(); index++) {
			if (inputVerb.equals(verbs.get(index).getInfinitive())) {
				inList = true;
				break;
			}
		}
		// If not in list of verbs
		if (inList == false) {
			System.out.println("Sorry, that is not in the list.");
		}
		return inList;
	}

	// Determines if verb is regular
	public boolean isRegular() {
		return verbs.get(index).isRegular();
	}

	// Display list of verbs
	public void displayList() {
		for (int i = 0; i < verbs.size() - 1; i++) {
			System.out.print((verbs.get(i).getInfinitive()) + ", ");
		}

		// Display last verb
		System.out.print(verbs.get(verbs.size() - 1).getInfinitive());
		System.out.println("");
	}

	// Test listOfVerbs
	public static void main(String[] args) {
		ListOfVerbs listOfVerbs = new ListOfVerbs();
		listOfVerbs.displayList();
		listOfVerbs.isInList("fragen");
		System.out.println(listOfVerbs.isRegular());
		listOfVerbs.isInList("haben");
		System.out.println(listOfVerbs.isRegular());
	}

}
