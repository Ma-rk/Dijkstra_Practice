package dijkstra;

import java.util.ArrayList;

public class Vertex {
	String vertexName;
	int distFromSource;
	ArrayList<Edge> edges;

	public Vertex(String vertexName) {
		this.vertexName = vertexName;
		this.edges = new ArrayList<Edge>();
	}

	public void addEdge(Edge edge){
		this.edges.add(edge);
	}
	
	public int getDistFromSource() {
		return distFromSource;
	}

	public void setDistFromSource(int distFromSource) {
		this.distFromSource = distFromSource;
	}
}
