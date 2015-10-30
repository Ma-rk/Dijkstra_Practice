package dijkstra;

import java.util.PriorityQueue;

public class Dijkstra {
	public void findShortestPath(Vertex source, Vertex dest, PriorityQueue<Vertex> q) {
		System.out.println("begin of findShortestPath...\n");

		q.remove(source);
		source.setAsSourceVertex();
		Vertex currentVertex = source;

		while (!q.isEmpty() && !currentVertex.equals(dest)) {
			Vertex nextVertex = null;
			for (Edge edge : currentVertex.edges) {
				if (edge.va.equals(currentVertex))
					nextVertex = edge.vb;
				else
					nextVertex = edge.va;

				if (nextVertex.distFromSource > currentVertex.distFromSource + edge.weight) {
					nextVertex.distFromSource = currentVertex.distFromSource + edge.weight;
					nextVertex.prioVertex = currentVertex;
				}
			}
			q = Utils.heapify(q);
			currentVertex = q.poll();
		}
	}
}
