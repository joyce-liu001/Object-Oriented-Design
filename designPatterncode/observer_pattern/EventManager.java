package observer_pattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
	Map<String, List<Observer>> listeners = new HashMap<>();

	public EventManager(String... operations) {
		for (String operation : operations) {
			listeners.put(operation, new ArrayList<>());
		}
	}

	public void subscribe(String operation, Observer observer) {
		List<Observer> observers = this.listeners.get(operation);
		observers.add(observer);
	}

	public void unsubscribe(String operation, Observer observer) {
		List<Observer> observers = this.listeners.get(operation);
		observers.remove(observer);
	}

	public void notify(String operation) {
		for (Observer observer : this.listeners.get(operation)) {
			observer.update();
		}
	}
}
