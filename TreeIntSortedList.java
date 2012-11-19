public class TreeIntSortedList implements IntSortedList {
	int value;
	TreeIntSortedList left;
	TreeIntSortedList right;

	public TreeIntSortedList(int initValue) {
		value = initValue;
		left = null;
		right = null;
	}

	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
			right = new TreeIntSortedList(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new TreeIntSortedList(newNumber);
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

	public String toString() {
		String retVal = this.value + ",";
		if (left != null) {
			retVal += left.toString();
		}

		if (right != null) {
			retVal += right.toString();
		}

		return retVal;
	}

}