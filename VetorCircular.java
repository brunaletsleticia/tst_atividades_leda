import java.util.*;
public class VetorCircular {
    /**
     * Escreva um programa que imprime um vetor de maneira circular. 
     * Seu programa deve receber uma sequência de valores e 
     * um inteiro N e deve imprimir as N posições da sequência lida. 
     * Naturalmente, N pode ser maior do que o tamanho da sequência lida.

Nesses casos, você deve reiniciar a impressão partindo novamente 
do início do vetor.

Entrada
Seu programa receberá na primeira linha uma sequência de valores separados por espaço
 e, na segunda linha, um valor N que dirá quantos elementos devem ser impressos.

Saída
Seu programa deve imprimir a sequencia de número com N elementos de forma circular.
 Ou seja, quando o último elemento for impresso ele deve voltar para o primeiro e 
 continuar até chegar a N elementos impressos.

Exemplos de execução
javac Solucao.java; java Solucao
4 5 6 1
6
4 5 6 1 4 5

javacSolucao.java; java Solucao
3 4 2
8
3 4 2 3 4 2 3 4
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int quantDaSequencia = sc.nextInt();
        sc.nextLine();
        String[] seq = sc.nextLine().split(" ");
        int[] a = new int[seq.length];
        for(int j =0;j < seq.length; j++){
            a[j] = Integer.parseInt(seq[j]);
        }
        System.out.println(vetorCircular(a, quantDaSequencia));
    }

    /**
     * n = 5 {10,20,30,40,50}
     * quant = 8 -->{10,20,30,40,50,10,20,30}
     * saida: String 10 20 ... 30
     */


    public static String vetorCircular(int[] array, int quantDaSequencia){
        String saida = "";
        int indice = 0;
        for(int j = indice; j < quantDaSequencia -1; j++){
            saida += array[indice % array.length] + " ";
            indice++;
        }
        saida += array[indice % array.length];
        return saida;
    }
}
