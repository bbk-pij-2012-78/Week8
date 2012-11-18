public class IntegerTreeNode {
	int value;
	IntegerTreeNode left;
	IntegerTreeNode right;

	public IntegerTreeNode(int initValue) {
		value = initValue;
		left = null;
		right = null;
	}

	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
			right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
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
}