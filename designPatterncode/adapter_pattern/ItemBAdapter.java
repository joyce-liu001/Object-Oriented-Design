package adapter_pattern;



public class ItemBAdapter extends ItemA{

	public ItemBAdapter(ItemB item) {
		super(item.getValue());
	}
}
