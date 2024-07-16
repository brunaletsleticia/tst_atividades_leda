import java.util.*;
/**
 * Dois somam
Escreva um programa que leia uma sequência 
não-ordenada de inteiros e um número inteiro, 
e retorne se há dois números presentes no array que somem ao número dado.

Entrada
Seu programa irá ler duas linhas da entrada: a primeira 
linha que consiste em uma lista de inteiros separados por 
espaço e a segunda linha consiste na soma a ser considerada.

Saída
Na saída, seu programa deve imprimir os dois números da 
sequência cuja soma é igual a soma lida da entrada padrão 
ou -1 caso contrário. Considere que, se houver um par de 
elementos cuja soma é a esperada, esse par é único.
 */

public class SomaDois {

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int numero = sc.nextInt();
		sc.nextLine();
		String[] entrada = sc.nextLine().split(" ");
		int[] array = new int[entrada.length];
		
		for(int j = 0; j < array.length; j++) {
			array[j] = Integer.parseInt(entrada[j]);
		}

    System.out.println(Arrays.toString(two_sum(array,numero)));

    }

public static int[] two_sum(int[] array, int numero){
    for(int j = 0; j < array.length; j++){
        for(int k = j + 1; k < array.length; k ++){
            if(array[j] + array[k] == numero){
                return new int[] {array[j], array[k]};
            }
        }
    } return new int[] {};
}


public static String somaDois(int[] array, int numero){
    String saida = "";
    boolean achou = false;
    for(int j = 0; j < array.length; j++){
        for(int i = j + 1; i < array.length; i++){
            if(array[j] + array[i] == numero){
                saida = array[j] + " " + array[i];
                achou = true;
                break;
            }
        }
        if (achou) {
            break; 
        }
    }
    if(achou == true){
        return saida;
    }else{
    return "-1";
        }
    }
}
