/**
 * 
 */
package problems.levelOrderTraversal;

import java.util.Scanner;

import modal.Node;
import problems.heightOfBinaryTree.GetHeight;
import service.TreeServices;

/**
 * @author Arockia_Antonyraj
 * You are given a pointer to the root of a binary tree. 
 * You need to print the level order traversal of this tree. 
 * In level order traversal, we visit the nodes level by level from left to right. 
 * You only have to complete the function.
 * Output: Print the values in a single line separated by a space.
 */
public class LevelOrderTraveral {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		TreeServices ts = new TreeServices();
		int i = scan.nextInt();
		Node root = null;
		while (i-- > 0) {
			int cur = scan.nextInt();
			root = ts.insert(root, cur);
		}
		scan.close();
		levelOrder(root);

	}

	private static void levelOrder(Node root) {
		int i = 0;
		int height = GetHeight.traverse(root) + 1;
		for(i=0; i<=height; i++) {
			printTreeLevelRec(root, i);
		}
		
	}
	
	private static void printTreeLevelRec(Node node, int level) {
		 if(node==null)
		        return;
		    if (level == 1)
		    	System.out.print(node.data+ " ");
		  
		    printTreeLevelRec(node.left, level-1);
		    printTreeLevelRec(node.right, level-1);
	}
	
	

}
