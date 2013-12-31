import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
// TODO: simplify as much as possible
// PROBLEM: output is wrong type
public class DepthFirstSearch extends Node{
	
	// method to check whether an object from arraylist of objects is in an other arraylist;
	public boolean IsThingHere(ArrayList<Node> here, ArrayList<Node> thing){
		boolean returned = false;
		for(int i=0;i<thing.size();i++){
			if(here.contains(thing.get(i))){
				returned = true;
			}
		}
		return returned;
	}
	
	// method to search for a next node;
	public Node searchNextNode(Node current, ArrayList<Node> path, ArrayList<Node> path1){
		boolean currentISvisited = IsThingHere(path1,current.getNeighbours());
		// try to find a current who has unvisited neighbours
		// while all neighbours of current are visited:
		Node next = current;
		while(currentISvisited==true){
			// all neighbours of current are already visited
			// go up by one node by taking the previous node in a path;
			next = path1.get(path1.indexOf(current)-1); // take only from nodes who still have unvisited neighb;
			path1.remove(current); // remove completely visited 
			current = next;
			// repeat the process;
			currentISvisited = IsThingHere(path,current.getNeighbours());
		}
		for(int i=0;i<current.getNeighbours().size();i++){
			if(!path.contains(current.getNeighbours().get(i))){
				current = current.getNeighbours().get(i);
				break;
			}
		}
		return current;
	}
	
	// constructor
	public DepthFirstSearch(Node startNode, ArrayList<Node> nodes) {
		super(nodes);
		Node current = startNode;
		ArrayList<Node> path = new ArrayList<>(); // keeps names of nodes already visited;
		ArrayList<Node> path1 = new ArrayList<>(); // contains nodes who don't have unvisited children;
		while(path.size()!=nodes.size()){
			path.add(current);
			path1.add(current);
			// search for next current:
			searchNextNode(current,path,path1);
		}
	}
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
	//System.out.println(node8.getNeighbours());
	DepthFirstSearch dfs = new DepthFirstSearch(node1, all);
	System.out.println(dfs);
}
}