
import java.util.*;
/*
 * Escreva um programa que ordena um array de inteiros utilizando o insertion sort. No entanto, dessa vez, sua implementação deve ser recursiva.

Seu programa deve imprimir o status do array a inserção ordenada (exceto a primeira).

Entrada
Seu programa irá ler apenas um linha de entrada, que consiste em uma lista de inteiros separados por espaço.

Saída
Na saída, imprima o array a cada inserção ordenada. Seu programa deve parar assim que imprimir a sequência ordenada.

Restrições
Seu programa deve, obrigatoriamente, utilizar recursão.

Dica
Imprima o array com Arrays.toString(array).

Exemplos de execução
javac Solucao.java; java Solucao
5 0 6 2
[0, 5, 6, 2]
[0, 5, 6, 2]
[0, 2, 5, 6]

javac Solucao.java; java Solucao
4 3 2 1
[3, 4, 2, 1]
[2, 3, 4, 1]
[1, 2, 3, 4]
 */


public class InsertionSort_Recursivo {
 
   
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");
        int[] array = new int[entrada.length];

        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(entrada[i]);
        }
       insertion_sort(array); 
       sc.close();
}


    public static void insertion_sort(int[] array){
        insertion_sort(array, 1);
    }

    private static void insertion_sort(int[] array, int indice){
        if(indice < array.length){// se o indice for menor q o tamanho do array
            int compara = array[indice]; //armazena valor atual do array no índice, que no primeiro momento eh 1
            int j = indice - 1; //j eh o anterior
            while( j >= 0 && array[j] > compara){//enqaunto j for maior/= a 0 e o numero do index j for maior q o numero comparado do indice
                array[j + 1] = array[j];//o elemento de j +1 sera o elemnto anterior
                j--;// j diminui
            } 
            array[j+1] = compara; //o elemento de j + 1 sera o elemento que comparado la encima
            System.out.println(Arrays.toString(array));   
            insertion_sort(array, indice + 1);//recursivo e o indice soma +, ou seja sera 2...
        }
    }

}