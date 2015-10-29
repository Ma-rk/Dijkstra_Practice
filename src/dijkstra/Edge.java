package dijkstra;

public class Edge {
	Vertex va, vb;
	int weight;
	boolean passed = false;
	String edgeName;

	public Edge(String edgeName) {
		this.edgeName = edgeName;
	}
}
