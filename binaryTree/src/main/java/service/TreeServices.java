/**
 * 
 */
package service;

import modal.Node;

/**
 * @author Arockia_Antonyraj
 *
 */
public class TreeServices {

	/**
	 * @param root
	 * @param data
	 * @return
	 */
	public Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
		}
		return root;
	}
}
