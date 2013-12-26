import java.util.ArrayList;

// main program to test graph data structure
public class GraphTest extends Graph{
	public static void main(String args[]){
		Graph.Node a = new Graph.Node("A");
		Graph.Node b = new Graph.Node("B");
		Graph.Node c = new Graph.Node("C");
		Graph.Node d = new Graph.Node("D");
		Graph.Node e = new Graph.Node("E");
		Graph.Node f = new Graph.Node("F");
		Graph.Edge ab = new Graph.Edge(a, b);
		Graph.Edge ac = new Graph.Edge(a, c);
		Graph.Edge bd = new Graph.Edge(b, d);
		Graph.Edge bc = new Graph.Edge(b, c);
		Graph.Edge cd = new Graph.Edge(c, d);
		Graph.Edge dc = new Graph.Edge(d, c);
		Graph.Edge ef = new Graph.Edge(e, f);
		Graph.Edge fc = new Graph.Edge(f, c);
		ArrayList<Node> allNodes = new ArrayList<>();
		allNodes.add(a);
		allNodes.add(b);
		allNodes.add(c);
		allNodes.add(d);
		allNodes.add(e);
		allNodes.add(f);	
		ArrayList<Edge> allEdges = new ArrayList<>();
		allEdges.add(ab);
		allEdges.add(ac);
		allEdges.add(bd);
		allEdges.add(bc);
		allEdges.add(cd);
		allEdges.add(dc);
		allEdges.add(ef);
		allEdges.add(fc);
		dfs(a,allNodes,allEdges);
	}
	/**
	 *  using stack in Python:
#def dfs(graph,start):
#	path = []
#	stack = [start]
#	while stack!=[]:
#		v = stack.pop()
#		if v not in path:
#			path.append(v)
#		for w in reversed(graph[v]):
#			if w not in path:
#				stack.append(w)
	 */
	public static ArrayList<Node> dfs(Node startNode, ArrayList<Node> allNodes, ArrayList<Edge> allEdges){
		ArrayList<Node> visited = new ArrayList<>(); // arraylist of all visited nodes
		ArrayList<Node> remain = allNodes; // arraylist of nodes that are not visited
		ArrayList<Node> path = new ArrayList<Node>(); 
		Node current = startNode;
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
				if(allEdges.get(i).inNode.equals(current)){
					Edge roadTaken = new Edge(current,allEdges.get(i).outNode);
					current = allEdges.get(i).outNode;
					i = allEdges.size();
					allEdges.remove(roadTaken);
				}
			}
		}		
		return path;
	}
}
