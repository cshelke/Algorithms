package huffman;

public class HuffmanNode {
	String symbol;
	int freq;
	HuffmanNode left;
	HuffmanNode right;
	String value;
	public HuffmanNode(String c, int fr, HuffmanNode l,HuffmanNode r)
	{
		this.symbol = c;
		this.freq = fr;
		this.left = l;
		this.right = r;
	}
	
	public int getFreq()
	{
		return freq;
	}
	
	@Override
	public String toString()
	{
		return "char:" + symbol + " frequency:" + freq; 
	}
	
	public HuffmanNode()
	{
		
	}

	
}
