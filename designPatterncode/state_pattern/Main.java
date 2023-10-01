package state_pattern;

public class Main {

	public static void main(String[] args) {
		Context context = new Context();
		context.getState().increase();
		context.getState().increase();
		context.getState().decrease();
		context.getState().decrease();
		context.getState().increase();
		context.getState().reset();

	}
}
