package template_pattern;

public class Main {

	public static void main(String[] args) {
		Process A = new ProcessA();
		Process B = new ProcessB();
		Process C = new ProcessC();
		A.start();
		System.out.println();
		B.start();
		System.out.println();
		C.start();
	}
}
