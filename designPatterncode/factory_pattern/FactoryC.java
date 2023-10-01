package factory_pattern;

public class FactoryC implements Creator{

	public FactoryC() {
	}

	@Override
	public Product create() {
		return new ProductC();
	}
}
