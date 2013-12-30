import java.util.ArrayList;
import java.util.HashMap;

// class that represents nodes in a graph
public class Node{
	protected ArrayList<Node> neighbours = new ArrayList<>();
	
	public Node(ArrayList<Node> neighbours){
		for(int i=0;i<neighbours.size();i++){
			this.neighbours.add(neighbours.get(i));
		}
	}
	public Node(){}
	public void setNeighbours(ArrayList<Node> neighbours){
	    this.neighbours.clear();
	    this.neighbours.addAll(neighbours);
	}
	public ArrayList<Node> getNeighbours(){
		return this.neighbours;
	}
}
