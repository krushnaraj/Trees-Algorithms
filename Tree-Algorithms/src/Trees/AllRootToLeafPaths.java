package Trees;

public class AllRootToLeafPaths {

	private Node root;
	
	private void printAllPaths(Node node)
	{
		int[] path=new int[1000];
		
		printAllPathsUtil(node, path, 0);
	}
	
	private void printAllPathsUtil(Node node, int[] path, int pathLen)
	{
		if(node==null)return;
		
		path[pathLen]=node.data;
		pathLen++;
		if(node.left==null && node.right==null)
		{
			printCurrentPath(path, pathLen);
		}
		else
		{
			printAllPathsUtil(node.left, path, pathLen);
			printAllPathsUtil(node.right, path, pathLen);
		}
	}
	
	private void printCurrentPath(int[] path, int pathLen)
	{
		
		for(int i=0; i<pathLen; i++)
		{
			System.out.print(path[i]+"\t");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllRootToLeafPaths allPaths=new AllRootToLeafPaths();
		allPaths.root=new Node(4);
		allPaths.root.left=new Node(45);
		allPaths.root.right=new Node(67);
		allPaths.root.left.left=new Node(12);
		allPaths.root.left.right=new Node(15);
		
		allPaths.printAllPaths(allPaths.root);

	}

}
