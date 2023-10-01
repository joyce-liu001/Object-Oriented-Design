package state_pattern;

public class StateTwo extends State{

	public StateTwo(Context context) {
		super(context);
	}

	@Override
	void increase() {
		System.out.println("Current state is state two, changing to state three...");
		this.context.setState(new StateThree(this.context));
		System.out.println("Current state is state three!");
	}

	@Override
	void decrease() {
		System.out.println("Current state is state two, changing to state one...");
		this.context.setState(new StateOne(this.context));
		System.out.println("Current state is state one!");
	}
}
