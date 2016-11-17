package Trees;

public class MirrorTree {
   
	private Node root;
	
	private void mirrorTree(Node node)
	{
		if(node==null)return;
		else
		{
			mirrorTree(node.left);
			mirrorTree(node.right);
			Node temp=node.left;
			node.left=node.right;
			node.right=temp;
		}
	}
	
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MirrorTree mt=new MirrorTree();
      mt.root=new Node(1);
      mt.root.left=new Node(34);
      mt.root.right=new Node(56);
      mt.root.left.left=new Node(12);
      mt.root.left.right=new Node(15);
      
      System.out.println("Original tree: ");
      mt.inOrderTraversal(mt.root);
      
      mt.mirrorTree(mt.root);
      System.out.println("\nMirrored Tree: ");
      mt.inOrderTraversal(mt.root);
      
	}

}
