import java.util.*;

public class SomaRecursiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] seq = sc.nextLine().split(" ");
        int[] a = new int[seq.length];
        for(int j =0;j < seq.length; j++){
            a[j] = Integer.parseInt(seq[j]);
        }
        System.out.println(soma(a));
    }
    /**
     * some os numeros do array de modo recursivo
     * 1 2 3 4
     * 10
     */
    
     public static int soma(int[] array){
        return somaRecursiva(array,0);
     }

     private static int somaRecursiva(int[] array, int indice){
        if(indice >= array.length){
            return 0;
        }
        //soma += array[indice];
        //return somaRecursiva(array, indice + 1, soma);
        return array[indice] + somaRecursiva(array, indice +1);
    
     }
}
