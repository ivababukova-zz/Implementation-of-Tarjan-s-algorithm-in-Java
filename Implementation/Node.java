import java.util.ArrayList;

// class that represents nodes in a graph
public class Node{

	protected ArrayList<Node> outnodes = new ArrayList<>();
	public void setOutnodes(ArrayList<Node> outnodes){
		this.outnodes = outnodes;
	}
	public Node(ArrayList<Node> outnodes){
		this.outnodes = outnodes;
	}
	public boolean isItOutnode(Node node){
		boolean returned = false;
		if(this.outnodes.contains(node)){
			returned = true;
		}
		return returned;
	}
	public ArrayList<Node> getOutnodes(ArrayList<Node> outnodes){
		return this.outnodes = outnodes;
	}
}
