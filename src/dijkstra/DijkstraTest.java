package dijkstra;

import java.util.PriorityQueue;

import org.junit.Test;

public class DijkstraTest {

	@Test
	public void test() {
		Vertex a = new Vertex("a");
		Vertex b = new Vertex("b");
		Vertex c = new Vertex("c");
		Vertex d = new Vertex("d");
		
		Utils.linkVertexes(a, b, 1000);
		Utils.linkVertexes(a, c, 2);
		Utils.linkVertexes(b, d, 1);
		Utils.linkVertexes(c, d, 100);

		PriorityQueue<Vertex> q = new PriorityQueue<Vertex>(100, Utils.comparator);
		
		q.add(d);
		q.add(c);
		q.add(a);
		q.add(b);

		Vertex from = d;
		Vertex to = a;

		runDijkstra(from, to, q);
	}
	@Test
	public void test2() {
		Vertex a = new Vertex("a");
		Vertex b = new Vertex("b");
		Vertex c = new Vertex("c");
		Vertex d = new Vertex("d");
		Vertex e = new Vertex("e");
		Vertex f = new Vertex("f");
		Vertex g = new Vertex("g");
		Vertex h = new Vertex("h");
		
		Utils.linkVertexes(c, h, 1);
		Utils.linkVertexes(a, b, 1);
		Utils.linkVertexes(a, c, 2);
		Utils.linkVertexes(b, f, 512);
		Utils.linkVertexes(f, e, 8);
		Utils.linkVertexes(f, g, 16);
		Utils.linkVertexes(c, d, 32);
		Utils.linkVertexes(d, e, 64);
		Utils.linkVertexes(e, g, 128);
		Utils.linkVertexes(e, b, 256);
		
		PriorityQueue<Vertex> q = new PriorityQueue<Vertex>(100, Utils.comparator);
		
		q.add(d);
		q.add(c);
		q.add(a);
		q.add(b);
		q.add(e);
		q.add(f);
		q.add(g);
		q.add(h);
		
		Vertex from = a;
		Vertex to = g;
		
		runDijkstra(from, to, q);
	}
	
	public void runDijkstra(Vertex from, Vertex to, PriorityQueue<Vertex> q){
		Dijkstra dij = new Dijkstra();
		dij.findShortestPath(from, to, q);
		
		Vertex currentVertex = to;
		System.out.println("totalDistance: " + currentVertex.distFromSource);
		System.out.print("Path: ");
		while (currentVertex!= null) {
			System.out.print(currentVertex.vertexName + " ");
			currentVertex = currentVertex.prioVertex;
		}
		
		System.out.println("\n\nend of program...");
	}
}
