package Trees;

public class CheckRootToLeafSum {

	private Node root;
	
	private boolean checkSum(Node node, int sum)
	{
		if(node==null)
		{
			if(sum==0)return true;
		}
		else
		{
			//boolean ans;
			int s=sum-node.data;
		    if(s==0 && node.left==null && node.right==null)
		    {
		    	return true;
		    }
		    
		    	if(node.left!=null)
		    	checkSum(node.left, s);
		    	
		    	if(node.right!=null)
		    	checkSum(node.right, s);
		    	
		    	return false;
		    }
		
		 return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     CheckRootToLeafSum rtls= new CheckRootToLeafSum();
     rtls.root=new Node(10);
     rtls.root.left=new Node(8);
     rtls.root.right=new Node(2);
     rtls.root.left.left=new Node(3);
     rtls.root.left.right=new Node(5);
     rtls.root.right.left=new Node(2);
     
     
     if(rtls.checkSum(rtls.root, 21))
     {
    	 System.out.println("There exists a root-to-leaf path of given sum");
     }
     else
     {
    	 System.out.println("There isn't such a path");
     }
	}

}
