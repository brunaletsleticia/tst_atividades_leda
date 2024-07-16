import java.util.*;
/**
 * Escreva um programa que leia uma sequência de
 *  números inteiros e troca os elementos vizinhos. 
 * Se o tamanho da sequência for impar, troque os vizinhos e 
 * mantenha o último elemento em sua posição.

Entrada
Seu programa irá ler uma sequência e armazená-la em um array de inteiros.

Saída
Na saída, seu programa deve imprimir o array resultante da 
troca dos elementos vizinhos. Dica: use Arrays.toString() 
para formatar a saída.

Exemplo de execução
javac Solucao.java; java Solucao
1 13 3 4 5
[13, 1, 4, 3, 5]

javac Solucao.java; java Solucao
1 7
[7, 1]
Restrições
O algoritmo deve ser in-place. Ou seja, 
não é permitido utilizar qualquer outro array auxiliar 
para trocar os elementos.
 */


public class TrocaVizinhos {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

		String[] entrada = sc.nextLine().split(" ");
		int[] array = new int[entrada.length];
		TrocaVizinhos tv = new TrocaVizinhos();
		for(int j = 0; j < array.length; j++) {
			array[j] = Integer.parseInt(entrada[j]);
		}
        //int[] out = tv.troca_vizinhos(array);
        System.out.println(move(array));
    }

public static String move(int[] array){
    for(int j = 1; j < array.length; j = j + 2){
        int aux = array[j];
        array[j] = array[j-1];
        array[j-1] = aux;
    }
    return Arrays.toString(array);
}












public static String troca_vizinhos(int[] array){
    for(int j = 0; j < array.length-1; j= j+2){
        int aux = array[j];
        array[j] = array[j+1];
        array[j+1] = aux;
    }
    return Arrays.toString(array);

}
}