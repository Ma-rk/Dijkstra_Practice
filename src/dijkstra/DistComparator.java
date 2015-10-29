package dijkstra;

import java.util.Comparator;

public class DistComparator implements Comparator<Vertex> {
	@Override
	public int compare(Vertex va, Vertex vb) {
		if (va.distFromSource < vb.distFromSource) {
			return -1;
		}
		if (va.distFromSource > vb.distFromSource) {
			return 1;
		}
		return 0;
	}
}
