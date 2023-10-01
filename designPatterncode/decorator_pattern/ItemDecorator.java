package decorator_pattern;

public abstract class ItemDecorator implements Item{

	protected Item item;

	public ItemDecorator(Item item) {
		this.item = item;
	}

	@Override
	public String getInfo() {
		return this.item.getInfo();
	}

}
