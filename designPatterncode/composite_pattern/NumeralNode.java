package composite_pattern;

public class NumeralNode implements TreeNode{

	private final int value;

	public NumeralNode(int value) {
		this.value = value;
	}

	@Override
	public int getResult() {
		return this.value;
	}

	@Override
	public String getString() {
		return String.valueOf(this.value);
	}
}
