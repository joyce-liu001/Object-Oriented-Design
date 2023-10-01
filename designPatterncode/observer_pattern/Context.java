package observer_pattern;

public class Context {
	public EventManager events;

	public Context() {
		this.events = new EventManager("operationOne", "operationTwo", "operationThree");
	}

	public void operationOne () {
		System.out.println("Doing operation one, notifying all related observers...");
		events.notify("operationOne");
	}

	public void operationTwo () {
		System.out.println("Doing operation two, notifying all related observers...");
		events.notify("operationTwo");
	}

	public void operationThree () {
		System.out.println("Doing operation three, notifying all related observers...");
		events.notify("operationThree");
	}

}
