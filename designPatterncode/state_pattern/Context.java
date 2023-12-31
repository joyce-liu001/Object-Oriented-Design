package state_pattern;

public class Context {
	protected State state;

	public Context() {
		this.state = new StateOne(this);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
