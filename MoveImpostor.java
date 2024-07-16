import java.util.Scanner;

public class MoveImpostor {
    /**Escreva um programa que encontra e move o impostor de uma
     *  lista de inteiros. O impostor é o primeiro número que quebra 
     * uma sequencia em ordem crescente. Por exemplo, na sequência:

    1 2 4 3 7 90
    O impostor é o elemento 3.
    
    Além de encontrar o impostor, você deve posiciona-lo em seu devido lugar. 
    Para o exemplo acima, sua função deve alterar a lista para a seguinte: 
    1 2 3 4 7 90.
    
    Importante! Só há um impostor. Como dito anteriormente, é o primeiro
     elemento que quebra uma sequência ordenada.
    
    Veja outro exemplo:
    
    5 7 8 19 -4 4 1 6 8 12 81 3
    
    Nessa sequência, o impostor é o elemento -4. Após a execução do seu algoritmo,
     a lista deve
    ficar neste estado:
    
    -4 5 7 8 19 4 1 6 8 12 81 3
    
    
    comparar se o anterior é maior q o impostor --> preciso identificar o indice e 
    o valor dele; depois preciso afastar os num para colocar o impostor
    */

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] seq = sc.nextLine().split(" ");
        int[] a = new int[seq.length];
        for(int j =0;j < seq.length; j++){
            a[j] = Integer.parseInt(seq[j]);
        }
        System.out.println(moveImpostorCrescente(a));
    }


    public static String moveImpostorDecrescente(int[] array){
        int indiceImpostor = -1;
        String saida = "";
        
        for(int j =1; j< array.length; j++){
            if(array[j] > array[j-1]){
                indiceImpostor = j;
                break;
            }
        }
        if(indiceImpostor == -1){
            for(int c = 0; c < array.length -1; c++){
                saida+= array[c] + " - ";
            }
            saida += array[array.length-1];
            return saida;
        }
        int impostor = array[indiceImpostor];

        for(int k = indiceImpostor; k > 0 && array[k-1] < impostor; k--){
            array[k] = array[k-1];
            indiceImpostor = k-1;
        }
        array[indiceImpostor] = impostor;

        for(int c = 0; c<array.length; c++){
            if(c == array.length-1){
                saida += array[array.length-1];
            }else{
            saida += array[c] + "-";
        }
    }
        return saida;
        
    }


    
    public static String moveImpostorCrescente(int[] array){
        String saida = "";
        int indiceImpostor = -1;//vai percorrer todo mundo e ve q ta ordenado
        
        for(int j = 1; j < array.length; j++){
            if(array[j] < array[j-1]){
                indiceImpostor = j;
                break;
            }
        }
        //System.out.println(indiceImpostor);

         if(indiceImpostor == -1){
            for(int j = 0; j < array.length -1; j++){
                 saida += array[j] + " ";
                 
        } 
        saida += array[array.length-1];
        return saida;
    } 
    int impostor =  array[indiceImpostor];

    for(int k = indiceImpostor; k > 0 && array[k-1] > impostor; k--){
        array[k] = array[k-1];
        indiceImpostor = k-1; 
    }
    array[indiceImpostor] = impostor;

    for(int j = 0; j < array.length; j++){
        if(j == array.length-1){
            saida += array[array.length-1];
        }else{
            saida += array[j] + " ";
        }        
}
 return saida;

    }
}
