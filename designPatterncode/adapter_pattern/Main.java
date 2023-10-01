package adapter_pattern;

public class Main {

	public static void main(String[] args) {
		ItemA A = new ItemA(10);
		ItemB B1 = new ItemB(100);
		ItemB B2 = new ItemB(10);
		ItemBAdapter adapter1 = new ItemBAdapter(B1);
		ItemBAdapter adapter2 = new ItemBAdapter(B2);
		System.out.println(A.hasEqualValue(adapter1));
		System.out.println(A.hasEqualValue(adapter2));
	}
}
