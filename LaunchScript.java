import java.util.Random;

public class LaunchScript {

    public static void main(String[] args) {
	  LaunchScript script = new LaunchScript();
	  script.launch();
    }

    public void launch() {
		Random generator = new Random();
		//IntegerTreeNode itn = new IntegerTreeNode(generator.nextInt());
		IntegerTreeNode itn = new IntegerTreeNode(6);
		System.out.println(itn.toSimplifiedString());
		System.out.println("Depth: " + itn.depth());

		addNumber(itn, 9);
		addNumber(itn, 5);
		addNumber(itn, 3);
		addNumber(itn, 8);
		addNumber(itn, 11);
		addNumber(itn, 12);

		/*
		int y = 0;

		for (int x = 0; x < 20; x++){
			y = generator.nextInt(100);
			System.out.println(y);
			itn.add(y);
		}*/

		System.out.println("Max Number: " + itn.getMax());
		System.out.println("Min Number: " + itn.getMin());
    }

	private void addNumber(IntegerTreeNode itn, int NewNumber) {
		itn.add(NewNumber);
		System.out.println(itn.toSimplifiedString());
		System.out.println("Depth: " + itn.depth());
	}

}