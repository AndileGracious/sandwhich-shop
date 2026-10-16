import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        double regularPrice = 5.45;
        double largePrice = 8.95;
        double price;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter sandwich size (1 for Regular, 2 for Large: ");
        int size = myScanner.nextInt();
        System.out.println("Enter your age: ");
        int age =  myScanner.nextInt();



        if (age <= 17){
            price = 0.9 * regularPrice;
            price = 0.9 * largePrice;

            }
        else if (age >= 65){
            price = 0.8 * regularPrice;
            price = 0.8 * largePrice;

        }
        else;
        price = regularPrice;
        price = largePrice;
        System.out.println("The cost is " + price);


    }
}
