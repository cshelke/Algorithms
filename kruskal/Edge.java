package kruskal;

public class Edge  {
	int start;
	int end;
	int cost;

	Edge(int s, int e, int c) {
		this.start = s;
		this.end = e;
		this.cost = c;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	

}
