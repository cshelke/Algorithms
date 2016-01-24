package dfs;

import java.util.ArrayList;
import java.util.LinkedList;

public class DFS {
	
	static LinkedList<Integer> adjList[];
	static int[] visited;
	
	public static void main(String[] args)
	{
		
		visited = new int[4];
		for (int i=0;i<3;i++)
			visited[i] = 0;
		
//		ArrayList<Edge> edgeList = new ArrayList<>();
		
		adjList = new LinkedList[4];
		for(int i=0;i<4;i++)
		{
			adjList[i] = new LinkedList();
		}
		
		adjList[0].add(1);
		adjList[0].add(2);
		adjList[1].add(2);
		adjList[2].add(0);
		adjList[2].add(3);
		
		dfs(2);
		
	}

	private static void dfs(int i) {
		// TODO Auto-generated method stub
		visited[i] = 1;
		System.out.println(i + " ");
		for(int j:adjList[i])
		{
			if (visited[j] == 0)
				dfs(j);
		}
		
	}

}
