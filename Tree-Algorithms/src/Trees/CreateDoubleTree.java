package Trees;

public class CreateDoubleTree {

	private Node root;
	
	private void inOrderTraversal(Node node)
	{
		if(node==null)return;
		else
		{
			inOrderTraversal(node.left);
			System.out.print(node.data+"\t");
			inOrderTraversal(node.right);
		}
	}
	
	private void doubleTree(Node node)
	{
		if(node==null)return;
		
		doubleTree(node.left);
		doubleTree(node.right);
		
		Node temp=node.right;
		node.right=new Node(node.data);
		node.right.right=temp;
		
		/*Node temp=node.left;
		node.left=new Node(node.data);
		node.left.left=temp;
		*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     CreateDoubleTree cdt=new CreateDoubleTree();
     cdt.root=new Node(10);
     cdt.root.left=new Node(45);
     cdt.root.right=new Node(50);
     cdt.root.left.left=new Node(4);
     cdt.root.left.right=new Node(12);
     cdt.root.right.left=new Node(56);
     cdt.root.right.right=new Node(68);
     
     System.out.println("Original Tree: ");
     cdt.inOrderTraversal(cdt.root);
     
	 cdt.doubleTree(cdt.root);
	 
	 System.out.println("\nModified Tree: ");
	 cdt.inOrderTraversal(cdt.root);
	 }

}
