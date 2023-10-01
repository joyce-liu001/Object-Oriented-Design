package factory_pattern;

public class FactoryB implements Creator{

	public FactoryB() {
	}

	@Override
	public Product create() {
		return new ProductB();
	}
}
