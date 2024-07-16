import java.util.*;

/**
 * Escreva um programa que imprima as posições (índices)
 *  de um elemento em uma dada sequência de inteiros.

Entrada
O programa deve ler da entrada um número inteiro N
e uma sequência de inteiros.

Saída
O programa deve imprimir na saída as posições
(separadas por espaço) em que se encontra o elemento na sequência.
Caso o elemento não esteja na sequência lida, imprima -1.

Exemplo de execução
python solution.py
7
1 5 3 2 88 9 2
-1

python solution.py
7
1 7 5 7 2 88 9 2
1 3
 */

public class PosicaoElemento {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		sc.nextLine();
		String[] entrada = sc.nextLine().split(" ");
		int[] array = new int[entrada.length];
		
		for(int j = 0; j < array.length; j++) {
			array[j] = Integer.parseInt(entrada[j]);
		}
        System.out.println(posicao(array, numero));
	}

    public static String posicao(int[] array, int numero){
        String saida = "";
        for(int j = 0; j < array.length;j++){
            if(array[j]== numero){
                if(saida.equals("")){
                    saida += j;
                }else{
                    saida += " " + j;

                }
            }
        }
        if(saida.equals("")){
            saida = "-1";
        }
        return saida;
    }
    
}
