public class ListIntSortedList implements IntSortedList {

	private int value;
	private ListIntSortedList nextInt;
	private ListIntSortedList prevInt;

	public ListIntSortedList(int n) {
		this.value = n;
		this.nextInt = null;
		this.prevInt = null;
	}

	public int getValue() {
		return this.value;
	}

	public void setNextInt(ListIntSortedList itn) {
		nextInt = itn;
	}

	public void setPrevInt(ListIntSortedList itn) {
		prevInt = itn;
	}

	public void add(int n) {
		if (n > this.value) {
			if (nextInt == null) {
				nextInt = new ListIntSortedList(n);
				nextInt.setPrevInt(this);
			} else {
				if (n > nextInt.getValue()) {
					nextInt.add(n);
				} else {
					ListIntSortedList itn = new ListIntSortedList(n);
					itn.setNextInt(nextInt);
					nextInt.setPrevInt(itn);
					nextInt = itn;
				}
			}
		} else {
			if (prevInt == null) {
				prevInt = new ListIntSortedList(n);
				prevInt.setNextInt(this);
			} else {
				if (prevInt.getValue() < n) {
					prevInt.add(n);
				} else {
					ListIntSortedList itn = new ListIntSortedList(n);
					itn.setPrevInt(prevInt);
					prevInt.setNextInt(itn);
					prevInt = itn;
				}
			}
		}
	}

	public boolean contains(int n) {
		if (this.value == n) {
			return true;
		} else {
			if (nextInt != null) {
				return nextInt.contains(n);
			} else {
				return false;
			}
		}
	}

	public String toString() {
		String retVal = "";
		retVal = this.value + ",";
		if (nextInt != null) {
			retVal += nextInt.toString();
		}
		return retVal;
	}

}