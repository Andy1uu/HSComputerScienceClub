import java.util.*;
public class NodesPractice {
	//Node class
	private static class Node {
		Node left;
		Node right;
		int data;

		public Node(int data) {
			left = null;
			right = null;
			this.data = data;
		}
	}
	//Print Tree method to traverse array
	public static void printTree(Node node) {
		//if node has no children, just print it
		if(node.left == null && node.right == null) {
			System.out.println(node.data);
		}
		//else it has children
		else {
			//prints it's data
			System.out.println(node.data);
			//checks the children and prints their data if possible
			if(node.left != null) {
				printTree(node.left);
			}
			if(node.right != null) {
				printTree(node.right);
			}
		}
	}
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int numNodes = in.nextInt();
		Node[] nodes = new Node[numNodes+1];
		for(int a  = 0; a<=numNodes; a++) {
			nodes[a] = new Node(a);
		}
		nodes[0].left = nodes[1];
		nodes[0].right = nodes[2];
		nodes[1].left = nodes[3];
		nodes[1].right = nodes[4];
		nodes[2].left = nodes[5];
		nodes[2].right = nodes[6];
		printTree(nodes[0]);
	}

}
