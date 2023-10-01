package strategy_pattern;

public class StrategyOne implements Strategy{

	@Override
	public void execute() {
		System.out.println("This is strategy one.");
	}
}
