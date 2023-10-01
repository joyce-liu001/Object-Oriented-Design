package state_pattern;

public class StateThree extends State{

	public StateThree(Context context) {
		super(context);
	}

	@Override
	void increase() {
		System.out.println("Current state is state three, changing to state three...");
		this.context.setState(new StateThree(this.context));
		System.out.println("Current state is state three!");
	}

	@Override
	void decrease() {
		System.out.println("Current state is state three, changing to state two...");
		this.context.setState(new StateTwo(this.context));
		System.out.println("Current state is state two!");
	}
}
