package abstract_factory_pattern;

public class FactoryB implements Factory{

	@Override
	public TypeAProduct createTypeA() {
		return new TypeAProductB();
	}

	@Override
	public TypeBProduct createTypeB() {
		return new TypeBProductB();
	}
}
