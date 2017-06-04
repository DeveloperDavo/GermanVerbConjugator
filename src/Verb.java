
/**
 * This class tells us what the verb is and if it is regular
 */
public class Verb {
	private String verb;
	private boolean regular;

	public Verb(String verb, boolean regular) {
		this.verb = verb;
		this.regular = regular;

	}

	// Determines if the verb is regular
	public boolean isRegular() {
		return regular;

	}

	// Get the verb
	public String getInfinitive() {
		return verb;

	}
}
