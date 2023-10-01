package state_pattern;

public abstract class State {
	Context context;

	public State(Context context) {
		this.context = context;
	}

	abstract void increase();

	abstract void decrease();

	public void reset() {
		System.out.println("Resetting to state one...");
		this.context.setState(new StateOne(this.context));
		System.out.println("Current state is state one!");
	}
}
