package visitor_pattern;

public class ItemVisitor implements Visitor{

	@Override
	public void visit(ItemA itemA) {
		System.out.println(itemA.getInfo());
	}

	@Override
	public void visit(ItemB itemB) {
		System.out.println(itemB.getInfo());
	}

	@Override
	public void visit(ItemC itemC) {
		System.out.println(itemC.getInfo());
	}
}
