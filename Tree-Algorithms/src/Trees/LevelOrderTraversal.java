package Trees;
import java.util.*;


public class LevelOrderTraversal {

	private Node root;
	
	private  void treeTraversal(Node node)
	{
		if(node == null) return;
		Queue<Node> queue= new LinkedList<Node>();
		queue.add(node);
		
		while(!queue.isEmpty())
		{
			Node temp=queue.poll();
			System.out.print(temp.data+"\t");
			
			if(temp.left!=null)
				queue.add(temp.left);
			
			if(temp.right!=null)
				queue.add(temp.right);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LevelOrderTraversal lt=new LevelOrderTraversal();
		lt.root=new Node(10);
		lt.root.left=new Node(12);
		lt.root.right=new Node(14);
		lt.root.left.left=new Node(24);
		lt.root.left.right=new Node(45);
		lt.root.right.left=new Node(145);
		lt.root.right.right=new Node(220);
		
		lt.treeTraversal(lt.root);
		
		
		

	}

}
