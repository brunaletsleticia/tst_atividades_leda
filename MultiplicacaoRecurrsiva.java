import java.util.Scanner;

public class MultiplicacaoRecurrsiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] seq = sc.nextLine().split(" ");
        int[] a = new int[seq.length];
        for(int j =0;j < seq.length; j++){
            a[j] = Integer.parseInt(seq[j]);
        }
        System.out.println(multiplica(a));
    }
    /**
     * multiplique os numeros do array de modo recursivo
     * 1 2 3 4
     * 24
     */

     public static int multiplica(int[] array){
        return multiplicaRecursivo(array, 0);
     }

     private static int multiplicaRecursivo(int[] array, int indice){
        if(indice >= array.length){
            return 1;
        }
        return array[indice] * multiplicaRecursivo(array, indice +1);
     }

}
