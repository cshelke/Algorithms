package dijkstra;

import java.util.Comparator;

public class vertexComparator implements Comparator {
	
	@Override
	public int compare(Object v1, Object v2)
	{
		return (((Vertex)v1).getDist() - ((Vertex)v2).getDist());
	}

}
