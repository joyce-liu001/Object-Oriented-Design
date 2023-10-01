package abstract_factory_pattern;

public class TypeBProductA implements TypeBProduct{

	public TypeBProductA() {
	}

	@Override
	public String getInfo() {
		return "Product: A, Type: B";
	}
}
