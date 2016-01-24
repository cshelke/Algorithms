package huffman;

import java.util.*;

public class Huffman {

//	static LinkedList<Integer> codeword;
	static int[] codeword;
	
	public static void main(String[] args)
	{
		PriorityQueue<HuffmanNode> q = new PriorityQueue<HuffmanNode>(6, new FreqComparator());
		HuffmanNode n1 = new HuffmanNode("a",45,null,null);
		HuffmanNode n2 = new HuffmanNode("b",13,null,null);
		HuffmanNode n3 = new HuffmanNode("c",12,null,null);
		HuffmanNode n4 = new HuffmanNode("d",16,null,null);
		HuffmanNode n5 = new HuffmanNode("e",9,null,null);
		HuffmanNode n6 = new HuffmanNode("f",5,null,null);
		
		q.add(n1);
		q.add(n2);
		q.add(n3);
		q.add(n4);
		q.add(n5);
		q.add(n6);
		
		HuffmanNode h1 = new HuffmanNode();
		HuffmanNode h2 = new HuffmanNode();
		
//		codeword = new LinkedList<Integer>();
		
		codeword = new int[6];
		
		while (true)
		{
			h1 = q.poll();
			h2 = q.poll();
			HuffmanNode temp = new HuffmanNode();
			temp.freq = h1.freq + h2.freq;
			temp.left = h1;
			temp.right = h2;
			temp.symbol = h1.symbol + h2.symbol;
			
			q.add(temp);
			if (q.size()<=1)
				break;
		}
		HuffmanNode root = q.poll();
//		print(root);
		printTree(root,0);
	}
	
	public static void print(HuffmanNode root)
	{
		if(root == null)
			return;
		print(root.left);
		System.out.println(root.symbol + " "+root.freq);
		print(root.right);
	}
	
	
	public static void printTree(HuffmanNode root,int depth)
	{
		if (root.left == null && root.right == null)
		{
			System.out.print("\n"+root.symbol + " - ");
			for (int i=0;i<depth;i++)
				System.out.print(codeword[i]);
			return;
			
		}
		
//		codeword.addLast(0);
		codeword[depth] = 0;
		printTree(root.left,depth+1);
		
//		codeword.pollLast();
//		
//		codeword.addLast(1);
		codeword[depth] = 1;
		printTree(root.right,depth+1);
	}
	
	public static Node insertToTree(HuffmanNode h, HuffmanNode h1, HuffmanNode h2)
	{
		Node root = new Node();
		Node lchild = new Node();
		Node rchild = new Node();
		
		lchild.value = 0;
		rchild.value = 1;
		root.left = lchild;
		root.right = rchild;
		
		return root;
	}
}
