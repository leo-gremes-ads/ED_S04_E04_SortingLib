package view;

import java.util.Arrays;
import lib.Sorting.Sorting;

public class Principal
{
	public static void main(String args[])
	{
		int[] lista = {10, 35, 22, -2, 140, 0};
		Sorting sort = new Sorting();
		
		System.out.println("Original -> " + Arrays.toString(lista));
		lista = sort.quickSort(lista);
		System.out.println("Ordenado -> " + Arrays.toString(lista));
	}
}
