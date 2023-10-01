package adapter_pattern;

public class ItemA {
	private final int value;

	public ItemA(int value) {
		this.value = value;
	}

	public boolean hasEqualValue(ItemA item) {
		return item.value == this.value;
	}
}
