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

    /**
    * Ordena um array de inteiros utilizando o selection sort.
    */
    public void sort(int[] v) {
	            for(int i = 0; i < v.length; i++){
	            	
	                int menor = i;
	                
	                for(int j = i +1; j < v.length; j ++){
	                    if(v[j] < v[menor]) {
	                    menor = j;
	                    }
	                }
	                int aux = v[i];
	                v[i] = v[menor];
	                v[menor] = aux;
	                }
	            }

    /**
    * Ordena um array de inteiros utilizando o selection sort de maneira recursiva.
    * Pense que selection sort são várias execuções da atividade de procurar 
    * o menor e colocá-lo em seu lugar. Use essa estratégia chamando recursivamente. 
    * Você não pode mudar a assinatura desse método, mas pode/deve criar outros
    * métodos para te auxiliar na recursão.
    */
    public void sortRecursivo(int[] v) {
	    sortRecursivo(v, 0);
	}
	        
	private void sortRecursivo(int[] v, int i){
	    if(i < v.length){
	        int i_menor = i;
	        for(int j = i +1; j < v.length; j ++){
	            if(v[j] < v[i_menor])
	                i_menor = j;
	        }
	        int aux = v[i];
	        v[i] = v[i_menor];
	        v[i_menor] = aux; 
	        sortRecursivo(v, i + 1);   

	        }
    }
	
}
