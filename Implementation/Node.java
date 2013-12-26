import java.util.ArrayList;

// class that represents nodes in a graph
public class Node{

	protected ArrayList<Node> outnodes = new ArrayList<>();
	protected ArrayList<Node> innodes = new ArrayList<>();
	public Node(){}
	public void setInnodes(ArrayList<Node> innodes){
		this.innodes = innodes;
	}
	public void setOutnodes(ArrayList<Node> outnodes){
		this.outnodes = outnodes;
	}
	public ArrayList<Node> getInnodes(ArrayList<Node> innodes){
		return this.innodes = innodes;
	}
	public ArrayList<Node> getOutnodes(ArrayList<Node> outnodes){
		return this.outnodes = outnodes;
	}
}
