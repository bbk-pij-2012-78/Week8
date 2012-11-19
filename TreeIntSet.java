public class TreeIntSet implements IntSet {
	int value;
	TreeIntSet left;
	TreeIntSet right;

	public TreeIntSet(int initValue) {
		value = initValue;
		left = null;
		right = null;
	}

	public void add(int n) {
		if (! contains(n)) {
			addNumber(n);
		}
	}

	private void addNumber(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new TreeIntSet(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new TreeIntSet(newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}

	public boolean contains(int n) {
		if (n == this.value) {
			return true;
		} else if (n > this.value) {
			if (right == null) {
				return false;
			} else {
				return right.contains(n);
			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.contains(n);
			}
		}
	}

	public int getMax() {
		if (right == null) {
			return value;
		} else {
			return right.getMax();
		}
	}

	public int getMin() {
		if (left == null) {
			return value;
		} else {
			return left.getMin();
		}
	}

	public String toString() {
		String retVal = "[" + value + "L[";
		if (left != null) {
			retVal += left.toString();
		} else {
			retVal += "]";
		}

		retVal += "]R[";
		if (right != null) {
			retVal += "R" + right.toString() + "]";
		} else {
			retVal += "]";
		}

		retVal += "]";

		return retVal;
	}

	public String toSimplifiedString() {
		String retVal = "[" + value;
		if (left != null) {
			retVal += "[" + left.toSimplifiedString();
		}

		if (right != null) {
			retVal += right.toSimplifiedString();
		}

		retVal += "]";

		return retVal;
	}

	public int depth() {
		if (right != null) {
			return right.depth() + 1;
		} else {
			return 0;
		}
	}

	public void remove(int n) {
		if (this.contains(n)) {
			if (this.value == n) {

			}
		}
	}

	public boolean containsVerbose(int n) {
		System.out.println(this.value);
		if (n == this.value) {
			return true;
		} else if (n > this.value) {
			if (right == null) {
				return false;
			} else {
				return right.containsVerbose(n);
			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.containsVerbose(n);
			}
		}
	}
}