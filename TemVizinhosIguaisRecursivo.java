import java.util.*;
public class TemVizinhosIguaisRecursivo {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] seq = sc.nextLine().split(" ");
        int[] a = new int[seq.length];
        for(int j =0;j < seq.length; j++){
            a[j] = Integer.parseInt(seq[j]);
        }
        System.out.println(temVizinhos(a));
    }

    /**
     * ve se tem vizinhos iguais (true--> break) and false
     * parada: achar e nao ter e sair do indice
     */
    public static boolean temVizinhos(int[] array){
        return temVizinhos(array,0);
    }
    private static boolean temVizinhos(int[] array, int indice){
        if(indice >= array.length -1){
            return false;
        }
        if(array[indice] == array[indice + 1]){
            return true;
        }
        return temVizinhos(array, indice +1);
    }
}