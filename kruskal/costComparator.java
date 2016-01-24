package kruskal;

import java.util.Comparator;

public class costComparator implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return (((Edge)arg0).getCost() - ((Edge)arg1).getCost());
	}

}
