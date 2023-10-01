package decorator_pattern;

public class ItemDecoratorA extends ItemDecorator{

	public ItemDecoratorA(Item item) {
		super(item);
	}

	@Override
	public String getInfo() {
		return this.item.getInfo() + "\nDecorated by Decorator A.";
	}
}
