package bst;


import java.util.Random;


public class testTree{ 
	
	
	public static void main(String[]args){
		BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
		BSTVisualizer visualizer = new BSTVisualizer("Tree", 600, 600);
		tree.add(5);
		tree.add(5);
		tree.add(3);
		tree.add(2);
		tree.add(7);
		
		int höjd = 	tree.height();
		int storlek = tree.size();
		
		System.out.println(höjd);
		System.out.println(storlek);
		
		visualizer.drawTree(tree);

	}

}
