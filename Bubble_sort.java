import java.util.Arrays;
import java.util.Scanner;

public class Bubble_sort {

    /**⇒Implementação. Implemente o Bubble Sort. Bubble Sort é um algoritmo que
itera em um array comparando elementos adjacentes e os troca (aos pares) se a
ordem estiver errada. A varredura sob a lista é repetida até que todos os
elementos estejam ordenados corretamente. O método deverá retornar o array
ordenado de forma crescente.

public int[] bubble_sort(int[] lista);

Exemplos
5 13 3 4 8
3 4 5 8 13
    */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] seq = sc.nextLine().split(" ");
        int[] a = new int[seq.length];
        for(int j =0;j < seq.length; j++){
            a[j] = Integer.parseInt(seq[j]);
        }
        System.out.println(Arrays.toString(ordenaBB(a)));
    }

    public static int[] ordenaBB(int[] array) {
		for(int j = 0; j < array.length-1; j++) {
			for(int k = 0; k < array.length-1-j; k++) {
				//if(array[k] > array[k+1]) {
                    if(array[k] < array[k+1]) {
					int aux = array[k];
					array[k] = array[k+1];
					array[k+1] = aux;
				}
			}
		}
		return array;
	}
	
}
