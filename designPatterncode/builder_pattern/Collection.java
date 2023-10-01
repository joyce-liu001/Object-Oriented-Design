package builder_pattern;

import java.util.ArrayList;
import java.util.List;

public class Collection {
	List<Item> items = new ArrayList<>();

	public void add (Item item) {
		items.add(item);
	}

	public String getInfo () {
		StringBuilder result = new StringBuilder();
		for (Item item : items) {
			result.append(item.getInfo());
		}
		return result.toString();
	}

}
