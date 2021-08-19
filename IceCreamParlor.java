import java.util.*;


public class IceCreamParlor {

	public static int indexOf(int[] menu, int val, int excludeInd) {

		for(int i = 0; i < menu.length; i++) {
			if(menu[i] == val && i != excludeInd) {
				return i;
			}
		}
		return -1;
	}

	public static int[] getIndicesFromValues(int[] menu, int val1, int val2) {

		int ind1 = indexOf(menu, val1, -1);
		int ind2 = indexOf(menu, val2, ind1);
		int[] indices = {Math.min(ind1, ind2), Math.max(ind1, ind2)};

		return indices;
	}

	public static int[] findChoices(int[] menu, int money) {
		int[] sortedMenu = menu.clone();
		Arrays.sort(sortedMenu);

		for(int i = 0; i < sortedMenu.length; i++) {
			int complement = money - sortedMenu[i];
			int location = Arrays.binarySearch(sortedMenu, i+1, sortedMenu.length, complement);

			if(location >= 0 && location < sortedMenu.length && sortedMenu[location] == complement) {
				int[] indices = getIndicesFromValues(sortedMenu, sortedMenu[i], complement);
				return indices;
			}
		}

		return null;
	}

	public static void main(String[] args) {

		System.out.println("Ice Cream Parlor");

		int[] menu = {1, 2, 3, 5, 7, 10, 20};
		int money = 15;

		int[] indices = findChoices(menu, money);

		if(indices != null) {
			for(int i : indices) {
					System.out.println("Flavour inds: " + i);
				}
		}

		System.out.println();

	}
}
