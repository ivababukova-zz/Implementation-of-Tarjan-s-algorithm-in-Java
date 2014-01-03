import java.util.ArrayList;

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
	public Node getNode(Node node){
		return this.getNeighbours().get(neighbours.indexOf(node));
	}
	//@Override
	public String toString(int index){		
		ArrayList<String> s = new ArrayList<>();
		for(int i=0;i<this.neighbours.size();i++){
			s.add(""+neighbours.get(i));
		}
		return s.get(index);
	}
}
