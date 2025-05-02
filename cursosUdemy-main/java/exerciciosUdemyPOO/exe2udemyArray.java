import java.util.Locale;
import java.util.Scanner;

public class exe2udemyArray{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        double soma = 0.0;
        double media = 0.0;

        System.out.print("Quantos números voce vai digitar?: ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i=0;i<vect.length;i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }
        System.out.print("Valores =  ");
        
        for(int i = 0;i<vect.length;i++){
            System.out.printf("%.1f ", vect[i]);
        }
        System.out.println("");

        System.out.print("Soma = ");
        for(int i = 0;i<vect.length;i++){
            soma += vect[i];
        }
        System.out.printf("%.2f%n", soma);
        System.out.printf("Media = ");
        for(int i = 0;i<vect.length;i++){
            media = soma / vect.length;
        }
        System.out.printf("%.2f", media);
        sc.close();
    }
}