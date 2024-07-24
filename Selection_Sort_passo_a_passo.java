import java.util.Arrays;
import java.util.Scanner;


public class Selection_Sort_passo_a_passo {

    
/**
 * Selection Sort passo a passo
Escreva um programa que ordena um array de inteiros utilizando
 o selection sort. Seu programa deve imprimir o status do array a fim de iteração.

Entrada
Seu programa irá ler apenas um linha de entrada, que consiste em uma 
lista de inteiros separados por espaço.

Saída
Na saída, imprima o array de entrada a cada fim de iteração. Seu
programa deve parar assim que imprimir a sequência ordenada.

Dica
Use Arrays.toString(array) para imprimir o array.

Exemplos de execução
javac Solucao.java; java Solucao
5 0 6 2
[0, 5, 6, 2]
[0, 2, 6, 5]
[0, 2, 5, 6]

javac Solucao.java; java Solucao
4 3 2 1
[1, 3, 2, 4]
[1, 2, 3, 4]
 */



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");
        int[] array = new int[entrada.length];

        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(entrada[i]);
        }
        selectionSortPasso(array);
	}

	

    public static void selectionSortPasso(int[] array){
        for(int j = 0; j < array.length;j++){
        int indiceMenor = j;
        for(int i = j + 1; i < array.length; i++){
            if(array[i] < array[indiceMenor]){
                indiceMenor = i;
            }
        }
        int aux = array[j];
            array[j] = array[indiceMenor];
            array[indiceMenor] = aux;
            if(indiceMenor != j){//menor elemento encontrado não está na posição correta (não está na posição j).
                System.out.println(Arrays.toString(array));//se houve uma troca, ou seja, se o menor elemento encontrado não estava na posição correta (indiceMenor != j).


            }
    }
    }

}