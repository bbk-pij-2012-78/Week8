public interface IntSortedList {

	/**
	*adds a new int to the list so that the list remains sorted; a list can contain duplicates unlike a set.
	*/
	public void add(int n);

	/**
	*returns true if the number is in the list, false otherwise.
	*/
	public boolean contains(int n);

	/**
	*returns a string with the values of the elements in the list separated by commas.
	*/
	public String toString();

}