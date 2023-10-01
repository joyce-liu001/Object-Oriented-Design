package visitor_pattern;

public class ItemA implements Item{

	@Override
	public void accept(ItemVisitor itemVisitor) {
		itemVisitor.visit(this);
	}

	@Override
	public String getInfo() {
		return "This is Item A.";
	}

}
