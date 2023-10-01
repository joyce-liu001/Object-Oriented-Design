package iterator_pattern;

public class Main {

	public static void main(String[] args) {
		/*
				A
			  /  \
		     B   G
		   /  \
		  C    D
		     /  \
		    E    F

		 */
		TreeNode A = new TreeNode("A");
		TreeNode B = new TreeNode("B");
		TreeNode C = new TreeNode("C");
		TreeNode D = new TreeNode("D");
		TreeNode E = new TreeNode("E");
		TreeNode F = new TreeNode("F");
		TreeNode G = new TreeNode("G");
		A.setLeft(B);
		A.setRight(G);
		B.setLeft(C);
		B.setRight(D);
		D.setLeft(E);
		D.setRight(F);
		TreeIterator treeIterator = new TreeIterator(A);
		while (treeIterator.hasNext()) {
			System.out.print(treeIterator.next().getValue() + ' ');
		}
	}
}
