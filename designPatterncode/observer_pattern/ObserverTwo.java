package observer_pattern;

public class ObserverTwo implements Observer{

	@Override
	public void update() {
		System.out.println("Observer two is notified!");
	}
}
