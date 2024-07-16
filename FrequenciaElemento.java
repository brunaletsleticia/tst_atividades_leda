
import java.util.*;
/**
 * Escreva um programa que conta a frequência de um
 *  elemento em uma dada sequência de inteiros.

Entrada
O programa deve ler da entrada um número inteiro N
e uma sequência de inteiros.

Saída
O programa deve imprimir na saída a frequência de N na sequência lida.

Exemplo de execução
javac Solution.java ; java Solution
7
1 5 3 2 88 9 2
0

javac Solution.java ; java Solution
7
1 5 7 2 88 9 2
1
 */

public class FrequenciaElemento {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		sc.nextLine();
		String[] entrada = sc.nextLine().split(" ");
		int[] array = new int[entrada.length];
		
		for(int j = 0; j < array.length; j++) {
			array[j] = Integer.parseInt(entrada[j]);
		}
		System.out.println(contaFrequenciaElemento(array, numero));
	}

	public static int contaFrequenciaElemento(int[] array, int numero){
		int frequencia = 0;
		for(int j = 0; j < array.length; j++){
			if(array[j] == numero){
				frequencia +=1;
			}
		}
		return frequencia;
	}
}

