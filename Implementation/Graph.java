// a basic representation of a graph
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
public class Graph{
	
	// fields
	protected HashMap<Node,ArrayList<Node>> nodeMap = new HashMap<>();
	
	// the constructor, edges are parameters
	public Graph(HashMap<Node,ArrayList<Node>> nodeMap){
		this.nodeMap = nodeMap;
	}
	
	public Set<Node> getAllNodes(HashMap<Node,ArrayList<Node>> nodeMap){
		return nodeMap.keySet();	
	}
	
	//algorithms on graphs
	// depth first search:
	public ArrayList<Node> dfs(Node startNode, HashMap<Node,ArrayList<Node>> nodeMap){
		ArrayList<Node> visited = new ArrayList<>(); // arraylist of all visited nodes
		Set<Node> remain = nodeMap.keySet(); // arraylist of nodes that are not visited
		ArrayList<Node> path = new ArrayList<Node>(); 
		Node current = startNode; // the node we are at the moment
		while(remain.size()!=0){
			visited.add(current); // mark current as visited
			remain.remove(current);
			if(!path.contains(current)){
				path.add(current);
			}
			// choose next current:
			ArrayList<Node> currentAdjasent = nodeMap.get(current);
			int thereis = 0; // checker whether road that satisfies the conditions is found;
			// search for next current node, chose which road to take(first possible);
			for(int i=0;i<currentAdjasent.size();i++){
				if((currentAdjasent.get(i) is outnode) &&(!visited.contains(currentAdjasent.get(i)))){ // PROBLEM: check whether it is outnode
					current = currentAdjasent.get(i);
					thereis = 1;
					break;
				}
			}
			if(thereis==0){
				current = visited.get(-1); // take the previous node and simply go through another road;
			}
		}		
		return path;
	}
	}
	
	

