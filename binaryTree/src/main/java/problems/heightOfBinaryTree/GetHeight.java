/**
 * 
 */
package problems.heightOfBinaryTree;

import java.util.Scanner;

import modal.Node;
import service.TreeServices;

/**
 * @author Arockia_Antonyraj
 *
 */
public class GetHeight {

	/**
	 * @param args
	 */
	public static int left = 0;
	public static int right = 0;

	public static void main(String[] args) {
		TreeServices ts = new TreeServices();
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		Node root = null;
		while (t-- > 0) {
			int data = scan.nextInt();
			root = ts.insert(root, data);
		}

		scan.close();
		int height = height(root);
		System.out.println(height);

	}

	private static int height(Node root) {
		int height = traverse(root);
		return height;
	}

	public static int traverse(Node root) {
		int left = 0;
		int right = 0;
		if (root == null) {
			return 0;
		}
		if (null != root.left) {
			left = 1 + traverse(root.left);
		}
		if (null != root.right) {
			right = 1 + traverse(root.right);
		}
		return left > right ? left : right;
	}

}
