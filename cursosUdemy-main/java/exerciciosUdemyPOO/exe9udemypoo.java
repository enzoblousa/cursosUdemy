import java.util.Scanner;
import java.util.Locale;
import entities.Data;
public class exe9udemypoo{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        Data[] dataVect = new Data[n];
        for(int i = 0;i<n;i++){

            System.out.println("Entre com nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Entre com idade: ");
            int age = sc.nextInt();
            System.out.println("Entre com altura: ");
            double height = sc.nextDouble();

            dataVect[i] = new Data(name, age, height);
        }
        double avg = 0.0;
        double sum = 0.0;
            for(int i = 0; i<n; i++){
                sum += dataVect[i].getHeight();
                avg = sum / n;
            }
            System.out.println(sum);
            System.out.println(avg);

            int count = 0;
            for(int i = 0;i<n;i++){
                if (dataVect[i].getAge() < 16) {
                    count += 1;
                }
            }
            double percentage = count * 100.0 / n;
            System.out.println(percentage);
        sc.close();
    }
}
