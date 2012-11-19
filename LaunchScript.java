import java.util.Random;
import java.util.*;

public class LaunchScript {

    public static void main(String[] args) {
	  LaunchScript script = new LaunchScript();
	  script.menu();
    }

	public void menu() {
		int sel = 0;
		Scanner in = new Scanner(System.in);

		do {
			System.out.println("1. Integer Tree Node");
			System.out.println("2. Tree Int Set");
			System.out.println("3. List Int Set");
			System.out.println("4. Tree Int Sorted List");
			System.out.println("5. List Int Sorted List");
			System.out.print("Enter Selection: ");
			sel = in.nextInt();

			switch (sel) {
				case 1:
					launchIntTreeNode();
					break;
				case 2:
					launchTreeIntSet();
					break;
				case 3:
					launchListIntSet();
					break;
				case 4:
					launchTreeIntSortedList();
					break;
				case 5:
					launchListIntSortedList();
					break;
			}
		} while (sel != 9);
	}

    public void launchIntTreeNode() {
		IntegerTreeNode itn = new IntegerTreeNode(6);
		System.out.println(itn.toSimplifiedString());
		System.out.println("Depth: " + itn.depth());

		addNumberIntTreeNode(itn, 9);
		addNumberIntTreeNode(itn, 5);
		addNumberIntTreeNode(itn, 3);
		addNumberIntTreeNode(itn, 8);
		addNumberIntTreeNode(itn, 11);
		addNumberIntTreeNode(itn, 12);

		System.out.println("Max Number: " + itn.getMax());
		System.out.println("Min Number: " + itn.getMin());
    }

	private void addNumberIntTreeNode(IntegerTreeNode itn, int NewNumber) {
		itn.add(NewNumber);
		System.out.println(itn.toSimplifiedString());
		System.out.println("Depth: " + itn.depth());
	}

	public void launchTreeIntSet() {
		TreeIntSet itn = new TreeIntSet(6);
		System.out.println(itn.toSimplifiedString());
		System.out.println("Depth: " + itn.depth());

		itn.add(9);
		itn.add(5);
		itn.add(3);
		itn.add(3);
		itn.add(8);
		itn.add(11);
		itn.add(3);
		itn.add(12);
		itn.add(11);
		itn.add(12);

		System.out.println("Max Number: " + itn.getMax());
		System.out.println("Min Number: " + itn.getMin());

		System.out.println(itn.containsVerbose(12));
	}

	public void launchListIntSet() {
		ListIntSet itn = new ListIntSet(6);

		itn.add(9);
		itn.add(5);
		itn.add(3);
		itn.add(8);
		itn.add(11);
		itn.add(3);
		itn.add(12);

		System.out.println(itn.containsVerbose(12));
	}

	public void launchTreeIntSortedList() {
		TreeIntSortedList itn = new TreeIntSortedList(6);

		itn.add(9);
		itn.add(5);
		itn.add(3);
		itn.add(8);
		itn.add(11);
		itn.add(3);
		itn.add(12);

		System.out.println(itn.toString());
	}

	public void launchListIntSortedList() {
		ListIntSortedList itn = new ListIntSortedList(6);

		itn.add(9);
		itn.add(5);
		itn.add(8);
		itn.add(11);
		itn.add(3);
		itn.add(12);

		System.out.println(itn.toString());
	}
}
