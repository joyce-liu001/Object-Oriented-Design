package factory_pattern;

public class Main {

	public static void main(String[] args) {
		Creator A = new FactoryA();
		Creator B = new FactoryB();
		Creator C = new FactoryC();
		System.out.println(A.create().getInfo());
		System.out.println(B.create().getInfo());
		System.out.println(C.create().getInfo());
	}

}
