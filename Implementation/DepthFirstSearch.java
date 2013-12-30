import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
// TODO: simplify as much as possible
public class DepthFirstSearch extends Node{
	
	// method to check whether an object from arraylist of objects is in an other arraylist;
	public boolean IsThingHere(ArrayList<Node> here, ArrayList<Node> thing){
		boolean returned = false;
		for(int i=0;i<here.size();i++){
			if(here.contains(thing.get(i))){
				returned = true;
			}
		}
		return returned;
	}
	
	// method to search for a next node;
	public Node searchNextNode(Node current, ArrayList<Node> path, ArrayList<Node> visitedAll){
		boolean currentISvisited = IsThingHere(path,current.getNeighbours());
		while(currentISvisited==true){
			// all neighbours of current are already visited
			visitedAll.add(current);
			// go up by one node;
			current = path.get(path.indexOf(current)-1);
			// repeat the process;
		}
		for(int i=0;i<current.getNeighbours().size();i++){
			if(!path.contains(current.getNeighbours().get(i))){
				current = current.getNeighbours().get(i);
				break;
			}
		}
		return current;
	}
	public DepthFirstSearch(Node startNode, ArrayList<Node> nodes) {
		super(nodes);
		Node current = startNode;
		ArrayList<Node> path = new ArrayList<>(); // keeps names of nodes already visited
		ArrayList<Node> visitedAll = new ArrayList<>(); // keeps names of nodes which neighbours are visited
		while(path.size()!=nodes.size()){
			path.add(current);
			// search for next current:
			searchNextNode(current,path,visitedAll);
		}
	}
public static void main(String args[]){
	Node node1 = new Node();
	Node node2 = new Node();
	Node node3 = new Node();
	Node node4 = new Node();
	Node node5 = new Node();
	Node node6 = new Node();
	Node node7 = new Node();
	Node node8 = new Node();
	
	// TODO: 
	// somehow create objects: nodes with neighbours PROBLEM for now
	// test the algorithm
	node2 = new Node([node1, node8, node3]);
	node3 = new Node([node2, node5, node4]);
	node4 = new Node(node3);
	node5 = new Node([node3, node6, node7]);
	node6 = new Node([node5]);
	node7 = new Node([node5]);
	node8 = new Node([node2]);
	
	
}
}