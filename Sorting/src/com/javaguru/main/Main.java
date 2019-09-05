package com.javaguru.main;

import com.javaguru.sort.SelectionSort;
import com.javaguru.sort.Sort;

public class Main {
	
	public static void main(String[] args) {
		int[] array=new int[] {3,1,4,2,1,5,8,6};
		
		Sort selectionSort=new SelectionSort();
		selectionSort.sort(array);
		System.out.println("Sorted elements are: ");
		for (int i : array) {
			System.out.println(i);
		}
	}

}
