
class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}


	public void insertLeft( Node child) {
		this.left = child;
	}

	public void insertRight (Node child){
		this.right = child;
	}


}


// Solution 1: 
// Basic idea is to do an inorder traversal (left, node, right) and at the node step, compare the node value to the previous one (the one which was at the node)
// step before this one. If it is an ascending, then its good else its bad.

// Solution 2: 
// Min max method

class Solution {
	
	public static Integer last = null;

	public static void main(String[] args) {
		System.out.println("In order with static variable way");
		//invalid case
		Node root1 = new Node(10);
		Node left1 = new Node(5);
		Node right1 = new Node(7);
		root1.insertLeft(left1);
		root1.insertRight(right1);

		System.out.println(checkBST(root1));
		last = null;

		//invalid case
		Node root2 = new Node(10);
		Node left2 = new Node(10);
		Node right2 = new Node(10);
		root2.insertLeft(left2);
		root2.insertRight(right2);
		System.out.println(checkBST(root1));
		last = null;


		//valid case
		Node root3 = new Node(10);
		Node left3 = new  Node(4);
		Node right3 = new Node(11);
		root3.insertLeft(left3);
		root3.insertRight(right3);
		System.out.println(checkBST(root3));
		last = null;

		//Using the wrapper way
		System.out.println("In order wrapper way");
		System.out.println(checkBSTv2(root1));
		System.out.println(checkBSTv2(root2));
		System.out.println(checkBSTv2(root3));

		//Using the min max way
		System.out.println("Min max way");
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		System.out.println(checkBSTv3(root1,max, min));
		System.out.println(checkBSTv3(root2, max, min));
		System.out.println(checkBSTv3(root3, max, min));

	}

	public static boolean checkBST(Node root) {
		if( root == null) return true;

		if(!checkBST(root.left)) return false;

		if(last != null && last >= root.data) {
			return false;
		}


		last = root.data;

		if(!checkBST(root.right)) return false;

		return true;

	}

	//Note: An error I faced while coding this up, was that I forgot to reset last to null
	//after each input. So since its a static variable, it used the last value from the previous inputs
	//i.e. the same last value was shared among the 3 executed cases.

	//Another way to do this without a shared static variable would be to wrap last in a class
	// and pass an object of that class along with the root to every call of the checkBST method


	public static boolean checkBSTv2(Node root) {
		LastWrapper lastWrapper = new LastWrapper();
		return checkBSTv2(root, lastWrapper);
	}

	public static boolean checkBSTv2(Node root, LastWrapper lastWrapper) {
		if(root == null) return true;

		if(!checkBSTv2(root.left, lastWrapper)) return false;

		if(lastWrapper.last != null && lastWrapper.last >= root.data) {
			return false;
		}


		lastWrapper.last = root.data;

		if(!checkBSTv2(root.right, lastWrapper)) return false;

		return true;
	}


	public static boolean checkBSTv3 (Node root, int max, int min) {
		
		if(root == null) return true;
		
		//left subtree check
		if(!checkBSTv3(root.left, root.data, min)){
			return false;
		}

		if(root.data <= min || root.data >= max ) {
			return false;
		}

		//right subtree check
		if(!checkBSTv3(root.right, max, root.data)){
			return false;
		}

		return true;

	}
}

class LastWrapper {
	Integer last = null;
}