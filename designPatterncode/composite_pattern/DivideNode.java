package composite_pattern;

public class DivideNode extends OperatingNode{

	public DivideNode(TreeNode left, TreeNode right) {
		super(left, right);
	}

	@Override
	public int getResult() {
		return this.left.getResult() / this.right.getResult();
	}

	@Override
	public String getString() {
		return "(" + this.left.getString() + " / " + this.right.getString() + ")";
	}
}
