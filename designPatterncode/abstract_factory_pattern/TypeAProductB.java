package abstract_factory_pattern;

public class TypeAProductB implements TypeAProduct{

	public TypeAProductB() {
	}

	@Override
	public String getInfo() {
		return "Product: B, Type: A";
	}
}
