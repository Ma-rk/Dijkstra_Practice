package dijkstra;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Utils {
	public static Comparator<Vertex> comparator = new DistComparator();

	public static void linkVertexes(Vertex va, Vertex vb, int weight) {
		Edge edge = new Edge(va.vertexName + " to " + vb.vertexName);
		va.addEdge(edge);
		vb.addEdge(edge);
		edge.va = va;
		edge.vb = vb;
		edge.weight = weight;
	}

	public static PriorityQueue<Vertex> heapify(PriorityQueue<Vertex> q) {
		PriorityQueue<Vertex> newQ = new PriorityQueue<Vertex>(100, Utils.comparator);
		while (q.size() > 0)
			newQ.add(q.poll());
		return newQ;
	}
}
