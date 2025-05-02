import java.util.Scanner;
import java.util.Locale;


public class exe10udemypoo{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int array[] = new int[n];

        for(int i = 0; i<array.length;i++){
            System.out.print("Digite um número: ");
            array[i] = sc.nextInt();
        }
        int count = 0;
        System.out.print("numeros pares: ");
        for(int i=0;i<array.length;i++){
            if (array[i]%2 == 0) {
                System.out.printf("%d, ", array[i]);
                count++;
            }
        }
        System.out.printf("QUANTIDADE DEPARES = %d", count);
        
sc.close();
    }
}
