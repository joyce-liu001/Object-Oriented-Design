package singleton_pattern;

public class Main {

	public static void main(String[] args) {
		ThreadA A = new ThreadA();
		ThreadB B = new ThreadB();
		A.run();
		B.run();
	}

	static class ThreadA implements Runnable {

		@Override
		public void run() {
			Singleton A = new Singleton("Thread A");
			System.out.println(A.getInstance().getFlag());
		}
	}

	static class ThreadB implements Runnable {

		@Override
		public void run() {
			Singleton B = new Singleton("Thread B");
			System.out.println(B.getInstance().getFlag());
		}
	}

}
