package dijkstra;

import java.util.ArrayList;

public class Vertex {

	String vertexName;
	Vertex prioVertex;
	int distFromSource = Integer.MAX_VALUE;
	ArrayList<Edge> edges;

	public Vertex(String vertexName) {
		this.vertexName = vertexName;
		this.edges = new ArrayList<Edge>();
	}

	public void addEdge(Edge edge) {
		this.edges.add(edge);
	}

	public void setAsSourceVertex() {
		this.distFromSource = 0;
	}
}
