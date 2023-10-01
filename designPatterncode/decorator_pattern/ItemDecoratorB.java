package decorator_pattern;

public class ItemDecoratorB extends ItemDecorator{

	public ItemDecoratorB(Item item) {
		super(item);
	}

	@Override
	public String getInfo() {
		return this.item.getInfo() + "\nDecorated by Decorator B.";
	}
}
