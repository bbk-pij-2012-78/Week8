public class ListIntSet implements IntSet {

	private int value;
	private ListIntSet nextSet;
	private ListIntSet prevSet;

	public ListIntSet(int n) {
		this.value = n;
		this.nextSet = null;
		this.prevSet = null;
	}

	public void add(int newNumber) {
		if (this.nextSet == null) {
			// this means this is the last patient in the list
			this.nextSet = new ListIntSet(newNumber);
		} else {
			this.nextSet.add(newNumber);
		}
		this.nextSet.prevSet = this;
	}

	public boolean contains(int n) {
		boolean bRetVal = false;
		if (n == this.value) {
			bRetVal = true;
		}
		if (! bRetVal) {
			if (nextSet != null) {
				bRetVal = nextSet.containsVerbose(n);
			}
		}

		if (! bRetVal) {
			if (prevSet != null) {
				bRetVal = prevSet.containsVerbose(n);
			}
		}
		return bRetVal;
	}

	public boolean containsVerbose(int n) {
		System.out.println(this.value);
		return contains(n);
	}

	public String toString() {
		return "";
	}

}