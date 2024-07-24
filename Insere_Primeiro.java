import java.util.Arrays;
import java.util.Scanner;

/*
 * Implemente um programa em Java que posiciona o primeiro elemento de uma sequência de forma a ordená-la. A sequência de entrada sempre está ordenada de forma crescente (exceto pelo primeiro número).

Entrada
Seu programa deve ler uma sequência de inteiros da entrada.

Saída
Seu programa deve imprimir a sequência ordenada.

Dica: Use Arrays.toString()

Exemplos
javac Solution.java; java Solution
5 2 6 9 11 13
[2, 5, 6, 9, 11, 13]

javac Solution.java; java Solution
3 1 2 4
[1, 2, 3, 4]
 */
public class Insere_Primeiro {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");
        int[] array = new int[entrada.length];

        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(entrada[i]);
        }
        
        System.out.println(Arrays.toString(inserePrimeiro(array)));
    }
    
    //SELECTION SORT
    public static int[] inserePrimeiro(int[] array){
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
    }
        return array;
    }


}