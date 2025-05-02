import java.util.Locale;
import java.util.Scanner;

public class exe1udemyArray{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Quantos números voce vai digitar?: ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        if (n>10) {
            System.out.println("Entre com um número menor que 10");
        }
        for(int i=0;i<vect.length;i++){
            System.out.print("Entre com um número: ");
            vect[i] = sc.nextInt();
        }
        System.out.println("Numeros negativos: ");
        for(int i = 0;i<vect.length;i++){
            if (vect[i]<0) {
                System.out.printf("%d%n", vect[i]);
            }
        }

        sc.close();
    }
}