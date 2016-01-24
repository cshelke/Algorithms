package dijkstra;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra {

	public static void main(String[] args)
	{
		ArrayList<Edge> edgeList = new ArrayList<Edge>(5);
		Edge e1 = new Edge(0,1,10);
		edgeList.add(e1);
		Edge e2 = new Edge(0,3,5);
		edgeList.add(e2);
		Edge e3 = new Edge(1,2,1);
		edgeList.add(e3);
		Edge e4 = new Edge(1,3,2);
		edgeList.add(e4);
		Edge e5 = new Edge(2,4,4);
		edgeList.add(e5);
		Edge e6 = new Edge(3,1,3);
		edgeList.add(e6);
		Edge e7 = new Edge(3,2,9);
		edgeList.add(e7);
		Edge e8 = new Edge(3,4,2);
		edgeList.add(e8);
		Edge e9 = new Edge(4,0,7);
		edgeList.add(e9);
		Edge e10 = new Edge(4,2,6);
		edgeList.add(e10);
		
		PriorityQueue<Vertex> PQ = new PriorityQueue<>(5,new vertexComparator());
		Vertex v1 = new Vertex(0, 0);
		PQ.add(v1);
		
		

		int[] dist;
		dist = new int[5];
		for(int k=0;k<5;k++)
			dist[k] = 999;
		
		dist[0] = 0; //start vertex
		int verticesVisited = 0;
		
		
		while(!PQ.isEmpty())
		{
				Vertex u = PQ.poll();
				for (Edge e:edgeList)
				{
					if(e.start == u.name)
					{
						if(dist[e.end] > dist[e.start] + e.cost)
						{
							dist[e.end] = dist[e.start] + e.cost;
							Vertex v = new Vertex(dist[e.end],e.end);
							PQ.add(v);
						}
					}
				}
		
		}
		
		for (int i=0;i<5;i++)
			System.out.println(dist[i] + " ");
		
		
		
	}
}
 