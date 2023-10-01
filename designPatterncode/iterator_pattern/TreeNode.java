package iterator_pattern;

public class TreeNode {
	private TreeNode left = null;
	private TreeNode right = null;
	private final String value;

	public TreeNode(String value) {
		this.value = value;
	}

	public TreeNode getLeft() {
		return left;
	}

	public TreeNode getRight() {
		return right;
	}

	public String getValue() {
		return value;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

}
