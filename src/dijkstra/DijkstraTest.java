package dijkstra;

import org.junit.Test;

public class DijkstraTest {

	@Test
	public void test() {
		Vertex a = new Vertex("a");
		Vertex b = new Vertex("b");
		Vertex c = new Vertex("c");
		Vertex d = new Vertex("d");
		
		Utils.linkVertexes(a, b, 1);
		Utils.linkVertexes(a, c, 2);
		Utils.linkVertexes(b, d, 3);
		Utils.linkVertexes(c, d, 4);

		System.out.println("e. n. d");
	}

}
