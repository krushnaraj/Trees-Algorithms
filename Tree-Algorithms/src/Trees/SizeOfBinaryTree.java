package Trees;



public class SizeOfBinaryTree {
    
	private Node root; // Node object from Node class of package Trees
	
	private int size(Node node)
	{
		if(node==null)return 0;
		
		int lSize=size(node.left);
		int rSize=size(node.right);
			return (lSize+1+rSize);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        SizeOfBinaryTree tree=new SizeOfBinaryTree();
        tree.root=new Node(1);
        tree.root.left=new Node(5);
        tree.root.right=new Node(6);
        tree.root.left.left=new Node(15);
        tree.root.left.right=new Node(2);
        System.out.println("Size of the Tree is: "+tree.size(tree.root));
	}

}
