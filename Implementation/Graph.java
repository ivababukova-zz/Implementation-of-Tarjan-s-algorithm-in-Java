// a basic representation of a graph
import java.util.HashSet;
public class Graph {

	static class Edge{
		public final Node inNode;
		public final Node outNode;
		public Edge(Node inNode, Node outNode){
			this.inNode = inNode;
			this.outNode = outNode;			
		}
	}
	static class Node{
		public final String name;
		public final HashSet<Edge> inEdge;
		public final HashSet<Edge> outEdge;
		public Node(String name){
			this.name = name;
			this.inEdge = new HashSet<Edge>();
			this.outEdge = new HashSet<Edge>();
		}
		public Node addEdge(Node node){
			Edge edge = new Edge(this,node);
			node.inEdge.add(edge);
			outEdge.add(edge);
			return this;
		}
		@Override
		public String toString(){
			return name;
		}
	}
	
	
}
