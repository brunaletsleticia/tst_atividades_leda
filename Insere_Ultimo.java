import java.util.*;
public class Insere_Ultimo {

    /**
     * Implemente um programa em Java que posiciona o último elemento
     *  de uma sequência de forma a ordená-la. A sequência de entrada
     *  sempre está ordenada de forma crescente (exceto pelo último número).

Entrada
Seu programa deve ler uma sequência de inteiros da entrada.

Saída
Seu programa deve imprimir a sequência ordenada.

Dica: Use Arrays.toString()

Exemplos
javac Solution.java; java Solution
2 6 9 11 13 5
[2, 5, 6, 9, 11, 13]

javac Solution.java; java Solution
1 2 4 3
[1, 2, 3, 4]
     */


     //INSERTION SORT
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");
        int[] array = new int[entrada.length];

        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(entrada[i]);
        }
        
        System.out.println(Arrays.toString(insereUltimo(array)));
    }
    
public static int[] insereUltimo(int[] array){
    int j  = array.length-1;
    while(j > 0 && array[j] < array[j-1]){
        int aux = array[j];
        array[j] = array[j-1];
        array[j-1] = aux;
         j--;
    }
    return array;
} 
}
/**
 * 	/**public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] livros = scan.nextLine().split(",");
		ii(livros);
		scan.close();
	}

	private static void insertionSort(String[] array) {

		for (int i = 0; i < array.length; i++) {
			String pivot = array[i];
			int k = i - 1;
			while (k >= 0 && array[k].compareTo(pivot) > 0) {
				array[k + 1] = array[k];
				k--;
			}
			array[k + 1] = pivot;
			System.out.println(imprimeArray(array));
		}

	}
    public static void ii(String[] values) {
        for (int i = 1; i < values.length; i++) { 
            String aux = values[i];
            int j = i;
        
            while (j > 0 && values[j-1].compareTo(aux) > 0) {
                //int aux = values[j];
                //values[j] = values[j - 1];
                values[j] = values[j - 1];
                j --;
            }
            values[j-1] = aux;
            System.out.println(imprimeArray(values));

        }	
    }*/

    
//import java.util.Scanner;

