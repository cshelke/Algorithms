package dijkstra;

public class Vertex {
	int dist;
	int name;
	Vertex(int d,int n)
	{
		this.dist = d;
		this.name = n;
	}
	public int getDist() {
		return dist;
	}
	public void setDist(int dist) {
		this.dist = dist;
	}

}
