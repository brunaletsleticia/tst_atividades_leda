import java.util.ArrayList;
import java.util.Scanner;

public class Uniao {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
		// numero = sc.nextInt();
		//sc.nextLine();
		String[] entrada = sc.nextLine().split(" ");
		String[] ent = sc.nextLine().split(" ");
		int[] array = new int[entrada.length];
		int[] seq = new int[ent.length];

		
		for(int j = 0; j < array.length; j++) {
			array[j] = Integer.parseInt(entrada[j]);
		}
		
		for(int j = 0; j < seq.length; j++) {
			seq[j] = Integer.parseInt(ent[j]);
		}
        System.out.println(uni(array, seq));
}

//ArrayList
public static ArrayList uni(int[] a, int[] b){
    ArrayList u = new ArrayList<>();
    
    for(int j = 0; j < a.length; j++){
        u.add(a[j]);
    }
    boolean achou = false;
    
    for(int k = 0; k < b.length; k ++){
        achou = false;
        for(int c = 0; c < a.length; c++){
            if(b[k] == a[c]){
                achou = true;
                break;
            }
        }
        if(achou == false) {
            u.add(b[k]);
        }
    }
    return u;
}

}
