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
	/**
	def dfs(graph,start):
	path = []
	stack = [start]
	while stack!=[]:
		v = stack.pop()
		if v not in path:
			path.append(v)
		for w in reversed(graph[v]):
			if w not in path:
				stack.append(w)
	return path
	 */
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
			int thereis = 0;
			for(int i=0;i<currentAdjasent.size();i++){
				if(currentAdjasent.get(i) is outnode and it is not visited){ // PROBLEM: check whether it is outnode
					mark it as current;
					thereis = 1;
					break;
				}
			}
			if(thereis==0){
				move one stage up;
				go to other untaken road and choose other outnode as current;
			}
			
			
		}		
		return path;
	}
	}
	
	

