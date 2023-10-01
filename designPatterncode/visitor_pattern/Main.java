package visitor_pattern;

public class Main {

	public static void main(String[] args) {
		Item A = new ItemA();
		Item B = new ItemB();
		Item C = new ItemC();
		A.accept(new ItemVisitor());
		B.accept(new ItemVisitor());
		C.accept(new ItemVisitor());
	}
}
