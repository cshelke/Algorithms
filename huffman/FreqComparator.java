package huffman;
import java.util.*;

public class FreqComparator implements Comparator{

//	public int compare(HuffmanNode n1, HuffmanNode n2)
//	{
//		return (n1.freq - n2.freq);
////		return (n1.freq > n2.freq ? n1.freq : n2);
//	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return ((HuffmanNode) o1).getFreq() - ((HuffmanNode) o2).getFreq();
//		return 0;
	}
}
