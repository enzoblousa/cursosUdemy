import java.util.Scanner;
import java.util.Locale;
import entities.BankAccount;
public class exe8udemypoo{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        BankAccount ba;
        System.out.printf("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.printf("Enter holder: ");
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.nextLine().charAt(0);
        if (response=='y') {
            System.out.print("Enter initial deposit value: ");
            double initalDeposit = sc.nextDouble();
            ba = new BankAccount(number, holder, initalDeposit);
        }
        else{
            ba = new BankAccount(number, holder);
        }
        System.out.printf("Account data: %n");
        System.out.println(ba);
        System.out.print("Enter a deposit value: ");
        double amountDeposit = sc.nextDouble();
        ba.deposit(amountDeposit);
        System.out.println("Upadted account data:");
        System.out.println(ba);
        System.out.print("Enter a withdraw value:");
        double amountWithdraw = sc.nextDouble();
        ba.withdraw(amountWithdraw);
        System.out.println("Upadted account data:");
        System.out.println(ba);

        sc.close();
    }
}
