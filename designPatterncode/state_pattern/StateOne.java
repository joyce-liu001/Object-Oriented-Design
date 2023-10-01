package state_pattern;

public class StateOne extends State {

	public StateOne(Context context) {
		super(context);
	}

	@Override
	public void increase() {
		System.out.println("Current state is state one, changing to state two...");
		this.context.setState(new StateTwo(this.context));
		System.out.println("Current state is state two!");
	}

	@Override
	void decrease() {
		System.out.println("Current state is state one, changing to state one...");
		this.context.setState(new StateOne(this.context));
		System.out.println("Current state is state one!");
	}
}
