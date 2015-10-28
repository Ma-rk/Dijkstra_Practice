package dijkstra;

public class Utils {
	public static void linkVertexes(Vertex va, Vertex vb, int weight) {
		Edge edge = new Edge(va.vertexName + " to " + vb.vertexName);
		va.addEdge(edge);
		vb.addEdge(edge);
		edge.setVa(va);
		edge.setVb(vb);
		edge.setWeight(weight);
	}
}
