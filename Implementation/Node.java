import java.util.ArrayList;

// class that represents nodes in a graph
public class Node{
	
	protected ArrayList<Node> neighbours = new ArrayList<>();
	protected static int counter = 0;     
	protected int myCounter;
	
	public Node(ArrayList<Node> neighbours){
		myCounter = counter;
        counter++;
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
	public int getMyCounter(){
		return this.myCounter;
	}
	public Node getNode(Node node){
		return this.getNeighbours().get(neighbours.indexOf(node));
	}
	//@Override
    public String toString(){
        return Integer.toString(myCounter);
}
}
