import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class DepthFirstSearch {
	public ArrayList<Node> dfs(Node startNode, ArrayList<Node> nodes, ArrayList<Node> predecesors){
		ArrayList<Node> visited = new ArrayList<>(); // arraylist of all visited nodes
		ArrayList<Node> path = new ArrayList<Node>(); 
		Node current = startNode; // the node we are at the moment
		while((visited.size())!=(nodes.size())){
			if(!path.contains(current)){
				path.add(current);
				visited.add(current); // mark current as visited
			}
			// search for next current node;
			for(int i=0;i<nodes.size();i++){
				if((predecesors.get(i)==current)&&(!visited.contains(predecesors.get(i)))){
					current = nodes.get(i);
					break;
				}
			}
		}	
		return path;
	}
}