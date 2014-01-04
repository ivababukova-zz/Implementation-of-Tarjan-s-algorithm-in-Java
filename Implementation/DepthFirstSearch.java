import java.util.ArrayList;
// TODO: simplify as much as possible
public class DepthFirstSearch extends Node{
	
	protected ArrayList<Node> path = new ArrayList<>();
	
	public void setPath(){
		this.path = null;
	}
	
	public ArrayList<Node> getPath(){
		return this.path;
	}
	
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
		this.path = path;
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
	/**
	@Override
	public String toString(int index){
		ArrayList<String> s = new ArrayList<>();
		for(int i=0;i<this.path.size();i++){
			s.add(""+path.get(i));
		}
		return s.get(index);
	}
	**/
}