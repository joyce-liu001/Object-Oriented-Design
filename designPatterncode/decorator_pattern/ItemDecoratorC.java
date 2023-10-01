package decorator_pattern;

public class ItemDecoratorC extends ItemDecorator{

	public ItemDecoratorC(Item item) {
		super(item);
	}

	@Override
	public String getInfo() {
		return this.item.getInfo() + "\nDecorated by Decorator C.";
	}
}
