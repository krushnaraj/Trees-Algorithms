package Trees;

public class CountLeafNodes {

	private Node root;
	
	private int getLeafNodeCount(Node node)
	{
	 if (node==null)return 0;
	 else if(node.left==null && node.right==null)
	 {
	   
	   return 1;
	 }
	 else
		 return getLeafNodeCount(node.left)+getLeafNodeCount(node.right);
	}
	
	private void printLeafNodes(Node node)
	{
      if(node==null)return;
      else if(node.left==null && node.right==null)
      {
    	  System.out.println(node.data);
      }
      else
      {
    	  printLeafNodes(node.left);
    	  printLeafNodes(node.right);
      }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountLeafNodes leafCount=new CountLeafNodes();
		leafCount.root=new Node(10);
		leafCount.root.left=new Node(12);
		leafCount.root.right=new Node(14);
		leafCount.root.left.left=new Node(15);
		leafCount.root.left.right=new Node(160);
		
		System.out.println("Number of leaf nodes is: "+leafCount.getLeafNodeCount(leafCount.root));
        leafCount.printLeafNodes(leafCount.root);
	}

}
