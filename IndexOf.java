import java.util.*;

public class IndexOf {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        sc.nextLine();
        String[] seq = sc.nextLine().split(" ");
        int[] a = new int[seq.length];
        for(int j =0;j < seq.length; j++){
            a[j] = Integer.parseInt(seq[j]);
        }
        System.out.println(indexOf(a, numero));

    }
    /**
     * mostre o indice de um nuemro em um array de forma recursiva
     * parada: achar ou percorre e nao tiver(-1)
     */

     public static int indexOf(int[] array, int numero){
        return indice(array, numero, 0);
     }

     private static int indice(int[] array, int numero, int indice){
        if(indice >= array.length){
            return -1;
        }
        if(array[indice] == numero){
            return indice;
        }
       
        return indice(array, numero, indice+1);
     }
}
