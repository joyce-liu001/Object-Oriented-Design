package abstract_factory_pattern;

public class TypeAProductA implements TypeAProduct{

	public TypeAProductA() {
	}

	@Override
	public String getInfo() {
		return "Product: A, Type: A";
	}
}
