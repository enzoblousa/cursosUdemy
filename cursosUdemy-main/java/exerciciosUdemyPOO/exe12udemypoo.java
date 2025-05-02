import java.util.Scanner;
import java.util.Locale;
public class exe12udemypoo {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        System.out.println("digite os valores do vetor A:");
        for(int i = 0;i<n;i++){
            vector1[i] = sc.nextInt();
        }
        System.out.println("digite os valores do vetor B:");
        for(int i = 0;i<n;i++){
            vector2[i] = sc.nextInt();
        }
        System.out.println("VETOR RESULTANTE:");
        for(int i = 0;i<n;i++){
            System.out.println(vector1[i] + vector2[i]);
        }
        sc.close();
    }
}
