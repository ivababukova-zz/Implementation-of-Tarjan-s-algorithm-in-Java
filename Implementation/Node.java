import java.util.ArrayList;
import java.util.HashMap;

// class that represents nodes in a graph
public class Node{
	protected ArrayList<Node> nodes = new ArrayList<>();
	protected ArrayList<Node> predecesors = new ArrayList<>();
	
	public Node(Node node, Node predecesor){
		this.predecesors.add(predecesor);
		this.nodes.add(node);
	}
	
	public void setPredecesors(ArrayList<Node> predecesors){
		this.predecesors=predecesors;
	}
	public void setNodes(ArrayList<Node> nodes){
		this.nodes=nodes;
	}
	public ArrayList<Node> getNodes(){
		return this.nodes;
	}
	public ArrayList<Node> getPredecesors(){
		return this.predecesors;
	}
}
