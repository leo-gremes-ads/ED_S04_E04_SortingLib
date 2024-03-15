package lib.Sorting;

public class Sorting
{
	public Sorting()
	{
		super();
	}
	
	//QUICK SORT
	public int[] quickSort(int[] vet)
	{
		return quickSort(vet, 0, vet.length - 1);
	}
	
	public int[] quickSort(int[] vet, int inicio, int fim)
	{
		if (inicio < fim) {
			int pivo = dividir(vet, inicio, fim);
			quickSort(vet, inicio, pivo - 1);
			quickSort(vet, pivo + 1, fim);
		}
		return vet;
	}
	
	private int dividir(int[] vet, int inicio, int fim)
	{
		int pivo = vet[inicio];
		int e = inicio + 1;
		int d = fim;
		
		while (e <= d) {
			while (e <= d && vet[e] <= pivo)
				e++;
			while (e <= d && vet[d] > pivo)
				d--;
			if (e < d)
				trocar(vet, d--, e++);
		}
		trocar(vet, inicio, d);
		return d;
	}
	
	private void trocar(int[] vet, int i, int j)
	{
		int aux = vet[i];
		vet[i] = vet[j];
		vet[j] = aux;
	}
	
	//BUBBLE SORT
	public int[] bubbleSort(int[] vet)
	{
		int len = vet.length;
		
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - 1 - i; j++) {
				if (vet[j] > vet[j + 1]) {
					int aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
		}
		return vet;
	}
	
	//MERGE SORT	
	public int[] mergeSort(int[] vet)
	{
		return mergeSort(vet, 0, vet.length - 1);
	}
	
	public int[] mergeSort(int[] vet, int inicio, int fim)
	{
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			mergeSort(vet, inicio, meio);
			mergeSort(vet, meio + 1, fim);
			merge(vet, inicio, meio, fim);
		}
		return vet;
	}
	
	private void merge(int[] vet, int inicio, int meio, int fim)
	{
		int[] aux = new int[vet.length];
		int e = inicio;
		int d = meio + 1;
		
		for (int i = inicio; i <= fim; i++)
			aux[i] = vet[i];
		for (int i = inicio; i <= fim; i++) {
			if (e > meio) vet[i] = aux[d++];
			else if (d > fim) vet[i] = aux[e++];
			else if (aux[d] < aux[e]) vet[i] = aux[d++];
			else vet[i] = aux[e++];
		}
	}	
}
