package Trees;
import java.util.*;

public class SpiralLevelOrderTraversal {

	private Node root;
	
	private void spiralTraversal(Node node)
	{
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		
		s1.add(node);
		
		while(!s1.isEmpty() || !s2.isEmpty())
		{
			while(!s1.isEmpty())
			{
				Node temp=s1.pop();
				System.out.print(temp.data+"\t");
				
				if(temp.left!=null)
					s2.push(temp.left);
				if(temp.right!=null)
					s2.push(temp.right);
			}
			
			while(!s2.isEmpty())
			{
				Node temp=s2.pop();
				System.out.print(temp.data+"\t");
				if(temp.right!=null)
					s1.push(temp.right);
				if(temp.left!=null)
					s1.push(temp.left);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SpiralLevelOrderTraversal slt=new SpiralLevelOrderTraversal();
      slt.root=new Node(10);
      slt.root.left=new Node(14);
      slt.root.right=new Node(20);
      slt.root.left.left=new Node(25);
      slt.root.left.right=new Node(450);
      slt.root.right.left=new Node(560);
      slt.root.right.right=new Node(780);
      
      slt.spiralTraversal(slt.root);
	}

}
