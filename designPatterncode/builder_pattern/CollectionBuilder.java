package builder_pattern;

public class CollectionBuilder {

	public Collection buildCollectionA() {
		Collection collection = new Collection();
		collection.add(new TypeAItemB());
		collection.add(new TypeBItemA());
		return collection;
	}

	public Collection buildCollectionB() {
		Collection collection = new Collection();
		collection.add(new TypeAItemA());
		collection.add(new TypeBItemB());
		return collection;
	}

}
