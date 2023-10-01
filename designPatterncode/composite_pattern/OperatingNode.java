package composite_pattern;

public abstract class OperatingNode implements TreeNode{
	protected TreeNode left;
	protected TreeNode right;

	public OperatingNode(TreeNode left, TreeNode right) {
		this.left = left;
		this.right = right;
	}
}
