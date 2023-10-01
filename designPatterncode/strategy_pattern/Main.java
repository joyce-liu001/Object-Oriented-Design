package strategy_pattern;

public class Main {

	public static void main(String[] args) {
		 Context object = new Context(new StrategyOne());
		 object.execute();
		 object.setStrategy(new StrategyTwo());
		 object.execute();
		 object.setStrategy(new StrategyThree());
		 object.execute();
	}

}
