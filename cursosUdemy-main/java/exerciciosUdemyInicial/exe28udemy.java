import java.util.Locale;
import java.util.Scanner;

public class exe28udemy {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        double[] h = new double[n];
        for(int i = 0; i<n; i++){
            h[i] = sc.nextDouble();
        }
        double sum = 0.0;
        for(int i = 0;i<n;i++){
            sum += h[i]; 
        }
        double avg = sum / n;

        System.out.println(avg);

        sc.close();
    }
}
