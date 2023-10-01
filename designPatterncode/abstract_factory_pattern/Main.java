package abstract_factory_pattern;

public class Main {

	public static void main(String[] args) {
		Factory A = new FactoryA();
		Factory B = new FactoryB();
		System.out.println(A.createTypeA().getInfo());
		System.out.println(A.createTypeB().getInfo());
		System.out.println(B.createTypeA().getInfo());
		System.out.println(B.createTypeB().getInfo());
	}
}
