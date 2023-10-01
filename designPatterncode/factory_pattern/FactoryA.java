package factory_pattern;

public class FactoryA implements Creator{

	public FactoryA() {
	}

	@Override
	public Product create() {
		return new ProductA();
	}
}
