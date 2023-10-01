package decorator_pattern;

public class Main {

	public static void main(String[] args) {
		Item itemA = new ItemA();
		ItemDecorator ida = new ItemDecoratorA(new ItemA());
		ItemDecorator idb = new ItemDecoratorB(new ItemA());
		ItemDecorator idc = new ItemDecoratorC(new ItemA());

		System.out.println(itemA.getInfo());
		System.out.println(ida.getInfo());
		System.out.println(idb.getInfo());
		System.out.println(idc.getInfo());

	}
}
