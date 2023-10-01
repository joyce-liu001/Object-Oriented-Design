package abstract_factory_pattern;

public class FactoryA implements Factory{

	@Override
	public TypeAProduct createTypeA() {
		return new TypeAProductA();
	}

	@Override
	public TypeBProduct createTypeB() {
		return new TypeBProductA();
	}
}
