import java.util.Arrays;
import java.util.Scanner;



public class Selection_Sort_Recursivo {
    
/*
 * Escreva um programa recursivo que ordena um array de inteiros utilizando o selection sort.

Seu programa deve imprimir o status do array a cada modificação nele. Lembre-se que no Selection Sort, alteramos o array quando encontramos o menor elemento e o colocamos na sua posição.

Entrada
Seu programa irá ler apenas um linha de entrada, que consiste em uma lista de inteiros separados por espaço.

Saída
Na saída, imprima o array a cada alteração. Seu programa deve parar assim que imprimir a sequência ordenada.

Restrições
Seu programa deve, obrigatoriamente, utilizar recursão.

Dica
Imprima o array com Arrays.toString(array).

Exemplos de execução
javac Solucao.java; java Solucao
1 2 3 4 6 5 
[1, 2, 3, 4, 6, 5]
[1, 2, 3, 4, 6, 5]
[1, 2, 3, 4, 6, 5]
[1, 2, 3, 4, 6, 5]
[1, 2, 3, 4, 5, 6]

javac Solucao.java; java Solucao
7 2 3 1 5
[1, 2, 3, 7, 5]
[1, 2, 3, 7, 5]
[1, 2, 3, 7, 5]
[1, 2, 3, 5, 7]
 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = getArrayInteiros(scan);
		sort(array);
		scan.close();
	}

	private static void sort(int[] array) {
		sort(array, 0);
	}

	private static void sort(int[] array, int indexAtual) {
		if (indexAtual < array.length - 1) {
			int indexOfMin = indexAtual;
			for (int i = indexAtual + 1; i < array.length; i++) {
				if (array[i] < array[indexOfMin]) {
					indexOfMin = i;
				}
			}
			swap(array, indexAtual, indexOfMin);
			System.out.println(Arrays.toString(array));
			sort(array, indexAtual + 1);
		}
	}

	private static void swap(int[] array, int i, int j) {
		int aux = array[j];
		array[j] = array[i];
		array[i] = aux;
	}

	private static int[] getArrayInteiros(Scanner scan) {
		String[] entrada = scan.nextLine().split(" ");
		int[] array = new int[entrada.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(entrada[i]);
		}
		return array;
	}

}