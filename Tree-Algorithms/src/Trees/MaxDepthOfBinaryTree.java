package Trees;

public class MaxDepthOfBinaryTree {
    private Node root;
    
    private int maxDepth(Node node)
    {
    	if(node==null)
    	{
    		 return 0;
    	}
    	
    	else
    	{
    	   int ldepth=maxDepth(node.left);
    	   int rdepth=maxDepth(node.right);
    	   return Math.max(ldepth, rdepth)+1;
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MaxDepthOfBinaryTree tree=new MaxDepthOfBinaryTree();
      tree.root=new Node(3);
      tree.root.left=new Node(5);
      tree.root.right=new Node(12);
      tree.root.left.left=new Node(34);
      tree.root.left.right=new Node(56);
      tree.root.left.left.left=new Node(567);
      tree.root.left.left.right=new Node(2345);
      
      System.out.println("Maximum depth of Binary Tree is: "+tree.maxDepth(tree.root));
      
	}

}
