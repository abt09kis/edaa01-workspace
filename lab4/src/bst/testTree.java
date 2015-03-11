package bst;


import java.util.Random;


public class testTree{ 
	
	
	public static void main(String[]args){
		Random rand = new Random();
		BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
		BSTVisualizer visualizer = new BSTVisualizer("Tree", 600, 600);
		/**
		tree.add(9);
		tree.add(3);
		tree.add(2);
		tree.add(7);
		*/
		for (int i = 0; i < 15; i++){
			tree.add(rand.nextInt(69));
		}
		
	
		
		int storlek = tree.size();
		int höjd = 	tree.height();
		
		System.out.println(höjd);
		System.out.println(storlek);
		
		tree.printTree();
				
		
		tree.rebuild();
		
		visualizer.drawTree(tree);
		
		

	}

}
