package abstract_factory_pattern;

public class TypeBProductB implements TypeBProduct{

	public TypeBProductB() {
	}

	@Override
	public String getInfo() {
		return "Product: B, Type: B";
	}
}
