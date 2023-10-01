package visitor_pattern;

public interface Item {
	void accept(ItemVisitor itemVisitor);
	String getInfo();

}
