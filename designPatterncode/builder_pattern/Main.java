package builder_pattern;

public class Main {

	public static void main(String[] args) {
		CollectionBuilder collectionBuilder = new CollectionBuilder();
		System.out.println("Building collection A...");
		System.out.println(collectionBuilder.buildCollectionA().getInfo());
		System.out.println("Building collection B...");
		System.out.println(collectionBuilder.buildCollectionB().getInfo());
	}

}
