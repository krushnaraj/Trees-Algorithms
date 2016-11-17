package Trees;

public class LCAOfBST {
    private Node root;
    
    private void inOrderTraversal(Node root)
    {
    	if(root==null)return;
    	else{
    		inOrderTraversal(root.left);
    		System.out.print(root.data+"\t");
    		inOrderTraversal(root.right);
    	}
    }
    
    private Node findLCA(Node node, int v1, int v2)
    {
    	if(node==null)return null;
    	else if(node.data > v1 && node.data > v2)
    		return findLCA(node.left, v1, v2);
    	else if(node.data < v1 && node.data < v2)
    		return findLCA(node.right, v1, v2);
    	else
    		return node;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LCAOfBST lca=new LCAOfBST();
		lca.root = new Node(20);
        lca.root.left = new Node(8);
        lca.root.right = new Node(22);
        lca.root.left.left = new Node(4);
        lca.root.left.right = new Node(12);
        lca.root.left.right.left = new Node(10);
        lca.root.left.right.right = new Node(14);
        
		lca.inOrderTraversal(lca.root);
		
		Node n=lca.findLCA(lca.root, 10, 14);
		
		System.out.println("\n\nLCA of 10 and 14 is: "+n.data);
		

	}

}
