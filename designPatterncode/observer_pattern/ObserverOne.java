package observer_pattern;

public class ObserverOne implements Observer{

	@Override
	public void update() {
		System.out.println("Observer one has notified!");
	}
}
