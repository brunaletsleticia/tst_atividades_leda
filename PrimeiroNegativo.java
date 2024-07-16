import java.util.Scanner;

/**Escreva um programa recursivo que encontra 
 * o primeiro número negativo de uma sequência.

Seu programa deve ler da entrada uma sequência e 
imprimir o primeiro elemento negativo.

Por exemplo, se a entrada for,

1 -8 4 5 -2 3 7 90
a saída deve ser -8.

Entrada
Seu programa deve ler uma sequência de inteiros separados por espaço.

Saída
Deve imprimir o primeiro valor negativo. Se não houver, imprima "-".

Exemplo
javac Solution.java; java Solution
5 7 8 19 -4 67 -89 -99
-4

javac Solution.java; java Solution
5 7 8 19 6 89 2
- */
public class PrimeiroNegativo {
    
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] entrada = sc.nextLine().split(" ");
		int[] array = new int[entrada.length];
		
		for(int j = 0; j < array.length; j++) {
			array[j] = Integer.parseInt(entrada[j]);
		}
        System.out.println(primeiroNegativo(array));
	}

    public static String primeiroNegativo(int[] array){
        return procuraNegativo(array, 0);
    }

    private static String procuraNegativo(int[] array, int indice){
        if(indice >= array.length){
            return "-";
        }
        if(array[indice]<0){
            return Integer.toString((array[indice]));
        }
        //indice++;
           return procuraNegativo(array,indice +1);
            //indice++;
        }
    }
