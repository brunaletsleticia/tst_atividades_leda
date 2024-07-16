import java.util.Scanner;

public class Top_N {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        int quantDaSequencia = sc.nextInt();
        sc.nextLine();
        String[] seq = sc.nextLine().split(" ");
        int[] a = new int[seq.length];
        for(int j =0;j < seq.length; j++){
            a[j] = Integer.parseInt(seq[j]);
        }
        System.out.println(top_n(a, quantDaSequencia));
    }
    

public static String top_n(int[] array, int num){
    String saida = "";
    for(int j = 0; j < array.length -1; j ++){
        for(int k = 0; k < array.length -1 -j; k++){
            if(array[k] < array[k+1]){
                int aux = array[k];
                array[k] = array[k+1];
                array[k+1] = aux;
            }
        }
    }
    int indice = 0;
    for(int c = 0; c < num -1; c++){
        saida += array[indice] + " ";
        indice ++;
    }
    saida += array[indice];
    return saida;
}
}



/**
 * Escreva um programa que imprima os n maiores elementos de uma sequência.

Entrada
Seu programa deve ler duas linhas da entrada padrão.
 A primeira é uma sequência de inteiros separados
  por espaço e a segunda um número inteiro n representando 
  a quantidade de elementos a serem impressos.

Importante: você pode considerar que n sempre é maior ou
 igual a 1 e menor ou igual ao número de elementos da sequência.

Saída
Seu programa deve imprimir de forma decrescente o n maiores
elementos da sequência lida.

Exemplo
javac Solution.java; java Solution
9 3 1 7 34 22 101 7 300 1 45
3
300 101 45

javac Solution.java; java Solution
9 3 1 7 34 22 101 7 300 1 45
4
300 101 45 34
*/