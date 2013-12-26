// a basic representation of a graph
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class Graph extends Node{
	
	// fields
	protected ArrayList<ArrayList<Node>> edges = new ArrayList<ArrayList<Node>>();
	
	// the constructor, edges are parameters
	public Graph(ArrayList<ArrayList<Node>> edges){
		this.edges = edges;
		for(int i=0;i<edges.size();i++){
			ArrayList<Node> edge = edges.get(i);		
			if(!innodes.contains(edge.get(0))){
					innodes.add(edge.get(0));
			}
			if(!outnodes.contains(edge.get(1))){
				outnodes.add(edge.get(1));
		    }
		}
	}
	//algorithms on graphs
	
	// depth first search:
	public ArrayList<Node> dfs(Node startNode, ArrayList<Node> allNodes, ArrayList<ArrayList<Node>> allEdges){
		ArrayList<Node> visited = new ArrayList<>(); // arraylist of all visited nodes
		ArrayList<Node> remain = allNodes; // arraylist of nodes that are not visited
		ArrayList<Node> path = new ArrayList<Node>(); 
		Node current = startNode; // the node we are at the moment
		while(remain.size()!=0){
			visited.add(current);
			remain.remove(current);
			if(!path.contains(current)){
				path.add(current);
			}
			// choose road - the first set of edges that satisfies the requirements: contain current as inEdge;
			// delete the edge taken from the list;
			// the second node in the edge taken is the new current node;
			for(int i=0;i<allEdges.size();i++){
				if(allEdges.get(i).get(0)==current){
					current = allEdges.get(i).get(1);
					allEdges.remove(allEdges.get(i));
					break;
				}
			}
		}		
		return path;
	}
	}
	
	

