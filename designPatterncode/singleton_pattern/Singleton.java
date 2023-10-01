package singleton_pattern;

public class Singleton {
	static private Singleton instance;
	private final String flag;

	public String getFlag() {
		return flag;
	}

	public Singleton(String flag) {
		this.flag = flag;
	}

	public Singleton getInstance() {
		if (Singleton.instance != null) {
			return Singleton.instance;
		}
		synchronized (Singleton.class) {
			if (Singleton.instance == null) {
				Singleton.instance = this;
			}
			return Singleton.instance;
		}
	}
}
