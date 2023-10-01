package builder_pattern;

public abstract class Item {
	protected String name;
	protected String type;

	public Item() {
		this.type = "default";
	}

	public String getInfo() {
		return "Name: " + this.name + '\n'
			+ "Type: : " + this.type + '\n';
	}

}
