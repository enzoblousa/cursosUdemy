import java.util.Scanner;
import java.util.Locale;


public class exe11udemypoo{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        double array[] = new double[n];

        for(int i = 0; i<array.length;i++){
            System.out.print("Digite um número: ");
            array[i] = sc.nextDouble();
        }
        double maior = 1;
        int posicao = 1;
        for(int i=0;i<array.length;i++){
            if (array[i] > maior) {
                maior = array[i];
                posicao = i;       
            }
        }
        System.out.printf("MAIOR = %.1f%n", maior);
        System.out.printf("POISCAO %d ", posicao);
sc.close();
    }
}
