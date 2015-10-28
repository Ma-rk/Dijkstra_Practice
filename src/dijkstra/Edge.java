package dijkstra;

public class Edge {
	Vertex va, vb;
	int weight;
	String edgeName;

	public Edge(String edgeName) {
		this.edgeName = edgeName;
	}

	public Edge(Vertex va, Vertex vb, int weight) {
		this.va = va;
		this.vb = vb;
		this.weight = weight;
	}

	public Vertex getVa() {
		return va;
	}

	public void setVa(Vertex va) {
		this.va = va;
	}

	public Vertex getVb() {
		return vb;
	}

	public void setVb(Vertex vb) {
		this.vb = vb;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
