import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DepthFirstSearch extends Graph{
	
	protected ArrayList<ArrayList<String>> graph = new ArrayList<ArrayList<String>>();
	protected ArrayList<String> vertices = new ArrayList<String>();

	public DepthFirstSearch(){
		this.graph = graph;
		this.vertices = vertices;
	}
	
	public void setGraph(ArrayList<ArrayList<String>> graph){
		this.graph = graph;
	}
	
	public void setVertices(ArrayList<String> vertices){
		this.vertices = vertices;
	}
	
	/**def dfs_rec(graph,start,path):
    path = path + [start]
    for edge in graph[start]: 
        if edge not in path:
            path = dfs_rec(graph, edge,path)
    print start
    return path
**/
	public List<String> dfs(ArrayList<ArrayList<String>> graph, String startNode, List<String> path){
		path.add(startNode);
		for(int i=0;i<vertices.size();i++){
			if(!path.contains(vertices.get(i))){
				path = dfs(graph,startNode,path);
			}
		}
		System.out.println("Starting node: " + startNode);
		return path;
		
	}
}
