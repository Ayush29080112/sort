package com.javaguru.sort;

public class SelectionSort implements Sort {

	@Override
	public int[] sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min_indx = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min_indx]) {
					min_indx = j;
				}
			}
			if (min_indx != i) {
				int temp = array[min_indx];
				array[min_indx] = array[i];
				array[i] = temp;
			}

		}
		return array;
	}

}
