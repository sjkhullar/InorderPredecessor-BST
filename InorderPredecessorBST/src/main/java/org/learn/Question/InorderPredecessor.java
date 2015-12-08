
package org.learn.Question;
import org.learn.PrepareTree.Node;

public class InorderPredecessor {
	private static Node max(Node root) {
		//we found the max node
		if(root.right == null) {
			return root;
		}
		return max(root.right);
	}
	
	public static Node predecessor(Node root, Node node) {
		//Example 3 or Example 4
		if(node.left != null)
			return max(node.left);
		
		//Example 1 or Example 2
		Node predecessor = null;
	    // Start from root and search for predecessor down the tree
	    while (root != null)
	    {
	    	if(node.data == root.data) {
	    		//by now we might found our predecessor
	    		break;
	    	} else if (node.data < root.data) {
	            root = root.left;
	        } else if (node.data > root.data) {
	        	predecessor = root;
	            root = root.right;	       
	        }
	    }
	   return predecessor;
	}
}
