import java.util.Scanner; // Importa a classe Scanner para entrada de dados pelo teclado
import java.util.Locale;  // Importa Locale para configurar o formato de números (ex: ponto decimal)
import entities.BankAccount; // Importa a classe BankAccount do pacote entities
public class program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US); // Define o formato padrão como EUA (para usar ponto como separador decimal)
        Scanner sc = new Scanner(System.in); 
        BankAccount ba; // Declaração da variável que irá armazenar o objeto da conta bancária

        System.out.printf("Enter account number: ");
        int number = sc.nextInt(); 
        sc.nextLine(); // Limpa o buffer
    
        System.out.printf("Enter holder: ");
        String holder = sc.nextLine(); 
        
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.nextLine().charAt(0);

        // Se a resposta for 'y', lê o valor do depósito inicial e cria o objeto com ele
        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initalDeposit = sc.nextDouble();
            ba = new BankAccount(number, holder, initalDeposit);
        }
        // Caso contrário, cria o objeto sem depósito inicial
        else {
            ba = new BankAccount(number, holder);
        }
        // Exibe os dados da conta após a criação
        System.out.printf("Account data: %n");
        System.out.println(ba);
        // Solicita e processa um depósito
        System.out.print("Enter a deposit value: ");
        double amountDeposit = sc.nextDouble();
        ba.deposit(amountDeposit); // Realiza o depósito

        System.out.println("Updated account data:");
        System.out.println(ba); // Exibe os dados atualizados da conta
        // Solicita e processa um saque
        System.out.print("Enter a withdraw value: ");
        double amountWithdraw = sc.nextDouble();

        ba.withdraw(amountWithdraw); // Realiza o saque

        System.out.println("Updated account data:");
        System.out.println(ba); // Exibe os dados atualizados da conta após o saque
        sc.close(); 
    }}
