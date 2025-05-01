import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class exe7udemypoo{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

    
        System.out.println("Enter product data");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Price: ");
        double price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        int quantity = sc.nextInt();        
        Product p = new Product(name, price, quantity);
        p.setName("salve");
        System.out.println();
        System.out.println("Product Data: " + p + p.getName());

        


        System.out.println("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        p.addProducts(quantity);
        System.out.println();
        System.out.println("Updated Data: " + p);

        System.out.println("Enter the number of products to be remove in stock: ");
        quantity = sc.nextInt();
        p.removeProducts(quantity);
        System.out.println("Updated Data: " + p);
        sc.close();
    }
}
