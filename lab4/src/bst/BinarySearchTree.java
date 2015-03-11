package bst;

public class BinarySearchTree<E extends Comparable<? super E>> {
	BinaryNode<E> root;
    int size;
    
	/**
	 * Constructs an empty binary searchtree.
	 */
	public BinarySearchTree() {
	root = null;
	size = 0;
		
	}

	/**
	 * Inserts the specified element in the tree if no duplicate exists.
	 * @param x element to be inserted
	 * @return true if the the element was inserted
	 */
	public boolean add(E x) {
		if(root == null){
			root = new BinaryNode<E>(x);
			size++;
			return true;
		}else{
			return add(root,x);
		}
	}
	private boolean add(BinaryNode<E> n, E x){
		int compResult = x.compareTo(n.element);
		if(compResult == 0){
			return false;
		}else if(compResult < 0 ){
			if(n.left == null){
				n.left = new BinaryNode<E>(x);
				size++;
				return true;
			}else{
				return add(n.left, x);
			}
		}else{ 
			if(n.right == null){
				n.right = new BinaryNode<E>(x);
				size++;
				return true;
			}else{
				return add(n.right,x);
			}
		}
		
	}
	/**
	 * Computes the height of tree.
	 * @return the height of the tree
	 */
	public int height() {
			return height(root);
	
	}
	
	
	private int height(BinaryNode<E> n){
		if(n == null){
			return 0;
		}else{
			int left = 1 + height(n.left);
			int right = 1 + height(n.right);
			if(left >= right){
				return left;
			}else{
				return right;
			}
		}
		
	}
	
	/**
	 * Returns the number of elements in this tree.
	 * @return the number of elements in this tree
	 */
	public int size() {
		return size;
	}
	
	/**
	 * Print tree contents in inorder.
	 */
	public void printTree() {
		printTree(root);

	}
	
	private void printTree(BinaryNode<E> n ){
		if(n == null){
			return;
		}else{
			printTree(n.left);
			System.out.print(n.element + " ");
			printTree(n.right);
		}
	}

	/** 
	 * Builds a complete tree from the elements in the tree.
	 */
	public void rebuild() {

	}
	
	/*
	 * Adds all elements from the tree rooted at n in inorder to the array a
	 * starting at a[index].
	 * Returns the index of the last inserted element + 1 (the first empty
	 * position in a).
	 */
	private int toArray(BinaryNode<E> n, E[] a, int index) {
		return 0;
	}
	
	/*
	 * Builds a complete tree from the elements a[first]..a[last].
	 * Elements in the array a are assumed to be in ascending order.
	 * Returns the root of tree.
	 */
	private BinaryNode<E> buildTree(E[] a, int first, int last) {
		return null;
	}
	


	static class BinaryNode<E> {
		E element;
		BinaryNode<E> left;
		BinaryNode<E> right;

		private BinaryNode(E element) {
			this.element = element;
		}	
	}
	
}
