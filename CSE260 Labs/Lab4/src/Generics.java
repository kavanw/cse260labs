import java.util.ArrayList;

public class Generics {
	public static void main(String[] args) {
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(2);
		test.add(1);
		test.add(9);
		test.add(1);
		sort(test);
		max(test);

	}

	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		ArrayList<E> copy = (ArrayList<E>) list.clone();
		System.out.println(copy);
		System.out.println(list);
		
		E min = list.get(0);
		int index = 0, place = 0;
		boolean inPlace;
		for (int k = 0; k < list.size(); k++) {
			min = list.get(k);
			for (int n = k; n < list.size(); n++) {
				// System.out.println(n);
				if (list.get(n).compareTo(min) < 1) {
					min = list.get(n);
					index = n;
				}
				// place++;
			}
			System.out.println(min);
			E hold = list.get(k);
			list.set(k, min);
			list.set(index, hold);
		}
	}

	public static <E extends Comparable<E>> E max(ArrayList<E> list) {
		E max = list.get(0);
		for(int j = 0; j<list.size();j++)
		{
			if(list.get(j).compareTo(max)==1)
			{
				max = list.get(j);
			}
		}
		System.out.println(max);
		return max;
	}


}
