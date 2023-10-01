package composite_pattern;

public class Main {

	public static void main(String[] args) {
		// ((1+2)*3)+((2*6)/3)
		TreeNode node1 = new PlusNode(new NumeralNode(1), new NumeralNode(2));
		node1 = new TimesNode(node1, new NumeralNode(3));
		TreeNode node2 = new TimesNode(new NumeralNode(2), new NumeralNode(6));
		node2 = new DivideNode(node2, new NumeralNode(3));
		TreeNode node = new PlusNode(node1, node2);
		System.out.println(node.getString());
		System.out.println(node.getResult());
	}


}
