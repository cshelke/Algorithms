package kruskal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Kruskal {
	
	static LinkedList<Integer> adjList[];
	static int[] visited;
	static int[] parent;
	
	public static void main(String[] args)
	{
		PriorityQueue<Edge> edgeList = new PriorityQueue<Edge>(14, new costComparator());
		Edge e1 = new Edge(0,1,4);
		edgeList.add(e1);
		Edge e2 = new Edge(0,5,8);
		edgeList.add(e2);
		Edge e3 = new Edge(1,2,8);
		edgeList.add(e3);
		Edge e4 = new Edge(1,5,11);
		edgeList.add(e4);
		Edge e5 = new Edge(2,6,2);
		edgeList.add(e5);
		Edge e6 = new Edge(2,3,7);
		edgeList.add(e6);
		Edge e7 = new Edge(2,8,4);
		edgeList.add(e7);
		Edge e8 = new Edge(3,4,9);
		edgeList.add(e8);
		Edge e9 = new Edge(3,8,14);
		edgeList.add(e9);
		Edge e10 = new Edge(4,8,10);
		edgeList.add(e10);
		Edge e11 = new Edge(5,6,7);
		edgeList.add(e11);
		Edge e12 = new Edge(5,7,1);
		edgeList.add(e12);
		Edge e13 = new Edge(6,7,6);
		edgeList.add(e13);
		Edge e14 = new Edge(7,8,2);
		edgeList.add(e14);
		
		parent = new int[9];
		for (int i=0;i<9;i++)
		{
			parent[i] = -1;
		}
		
		int totCost = 0;
		int n = 0;
		int V = 9; //total number of vertices
		
//		Edge e = edgeList.poll();
		while(n<V-1)
		{
			Edge e = edgeList.poll();
			if (find(e.start) != find(e.end))
			{
				union(e.start, e.end);
				totCost += e.cost;
				n++;
			}
//			e = edgeList.poll();
		}
		System.out.println(totCost);
		
	}

	private static void union(int start, int end) {
		// TODO Auto-generated method stub
		int x = (int) find(start);
		int y = (int) find(end);
		parent[x] = y;
	}

	private static int find(int i) {
		// TODO Auto-generated method stub
		if (parent[i]== -1)
			return i;
		return find(parent[i]);
	}

}
