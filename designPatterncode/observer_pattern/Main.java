package observer_pattern;

public class Main {

	public static void main(String[] args) {
		Context context = new Context();

		Observer tmp = new ObserverOne();

		context.events.subscribe("operationOne", tmp);
		context.events.subscribe("operationOne", new ObserverTwo());
		context.events.subscribe("operationOne", new ObserverThree());

		context.events.subscribe("operationTwo", new ObserverTwo());

		context.operationOne();

		context.operationTwo();

		context.operationThree();

		context.events.unsubscribe("operationOne", tmp);

		context.operationOne();

	}

}
