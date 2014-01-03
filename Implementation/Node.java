import java.util.ArrayList;

// class that represents nodes in a graph
public class Node{
	
	protected ArrayList<Node> neighbours = new ArrayList<>();
	protected static int counter = 0;     
	protected int myCounter;
	
	protected static int counter = 0;	
	
	protected int myCounter;

	public Node(ArrayList<Node> neighbours){
		myCounter = counter;
<<<<<<< HEAD
        counter++;
=======
		counter++;
>>>>>>> 56004b117f56f9bbf9dec7548e41a18077205b30
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
<<<<<<< HEAD
    public String toString(){
        return Integer.toString(myCounter);
}
=======
	public String toString(){
		return Integer.toString(myCounter);
	}
	public String toString(int index){		
		ArrayList<String> s = new ArrayList<>();
		for(int i=0;i<this.neighbours.size();i++){
			s.add(""+neighbours.get(i));
		}
		return s.get(index);
	}
>>>>>>> 56004b117f56f9bbf9dec7548e41a18077205b30
}
