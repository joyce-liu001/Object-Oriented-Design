package template_pattern;

public abstract class Process {

	abstract void report();

	public void start() {
		System.out.println("Process start...");
		report();
		System.out.println("Process finish!");
	}
}
