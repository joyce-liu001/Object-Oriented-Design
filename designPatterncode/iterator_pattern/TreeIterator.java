package iterator_pattern;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class TreeIterator implements Iterator<TreeNode> {
	Stack<TreeNode> stack = new Stack<>();

	public TreeIterator(TreeNode root) {
		stack.push(root);
	}

	@Override
	public boolean hasNext() {
		return !stack.isEmpty();
	}

	@Override
	public TreeNode next() {
		if (stack.isEmpty())
			throw new NoSuchElementException();
		TreeNode curr = stack.pop();
		if (curr.getRight() != null)
			stack.push(curr.getRight());
		if (curr.getLeft() != null)
			stack.push(curr.getLeft());
		return curr;
	}
}
