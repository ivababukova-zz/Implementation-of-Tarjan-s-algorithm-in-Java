import java.util.ArrayList;
public class GraphRaw{

	public static void main(String args[]){
		// example graph:
		Node node1 = new Node(); Node node2 = new Node(); Node node3 = new Node();
		Node node4 = new Node(); Node node5 = new Node(); Node node6 = new Node();
		Node node7 = new Node(); Node node8 = new Node();
		// TODO: 
		// test the algorithm
		node1.getNeighbours().add(node2);
		
		node2.getNeighbours().add(node1);
		node2.getNeighbours().add(node8);
		node2.getNeighbours().add(node3);
		
		node3.getNeighbours().add(node2);
		node3.getNeighbours().add(node5);
		node3.getNeighbours().add(node4);
		
		node4.getNeighbours().add(node3);
		
		node5.getNeighbours().add(node3);
		node5.getNeighbours().add(node6);
		node5.getNeighbours().add(node7);
		
		node6.getNeighbours().add(node5);
		
		node7.getNeighbours().add(node5);
		
		node8.getNeighbours().add(node2);
		
		ArrayList<Node> all = new ArrayList<>();
		all.add(node1); all.add(node2); all.add(node3); all.add(node4); all.add(node5);
		all.add(node6); all.add(node7); all.add(node8);
		System.out.println(node1.getNeighbours());
		//DepthFirstSearch dfs = new DepthFirstSearch(node1, all);
		//System.out.println(dfs);
	}
}
