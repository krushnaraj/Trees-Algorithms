package Trees;



public class IdenticalTrees {
    private Node tree1, tree2; // Node objects from Node class of package Trees
    
    
     private boolean checkIdenticalTrees(Node n1, Node n2)
     {
    	 if(n1==null && n2==null)return true;
    	 
    	 else if(n1!=null && n2!=null)
    	 {
    		 if(n1.data==n2.data)
    		 {
    			 return checkIdenticalTrees(n1.left,n2.left) && checkIdenticalTrees(n1.right, n2.right);
    		 }
    		 
    	 }
    	 return false;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IdenticalTrees it=new IdenticalTrees();
		it.tree1=new Node(1);
		it.tree1.left=new Node(2);
		it.tree1.right=new Node(6);
		it.tree1.left.left=new Node(67);
		it.tree1.left.right=new Node(89);
		it.tree1.right.left=new Node(78);
		
		it.tree2=new Node(1);
		it.tree2.left=new Node(2);
		it.tree2.right=new Node(6);
		it.tree2.left.left=new Node(67);
		it.tree2.left.right=new Node(89);
		it.tree2.right.left=new Node(78);
		
		if(it.checkIdenticalTrees(it.tree1,it.tree2))
		{
			System.out.println("Trees are identical");
		}else{
			System.out.println("Trees are not identical");
		}
        
	}

}
