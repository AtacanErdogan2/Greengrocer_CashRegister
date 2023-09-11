import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        float pear, apple, tomato, banana, eggplant;

        // Retrieving data from the user
        System.out.print("How many kilos of pears :");
        pear = input.nextFloat();
        System.out.print("How many kilos of apple :");
        apple = input.nextFloat();
        System.out.print("How many kilos of tomato :");
        tomato = input.nextFloat();
        System.out.print("How many kilos of banana :");
        banana = input.nextFloat();
        System.out.print("How many kilos of eggplant :");
        eggplant = input.nextFloat();

        // Calculation Section
        float pearPrice, applePrice, tomatoPrice, bananaPrice, eggplantPrice;

        pearPrice = 2.14f;
        applePrice = 3.67f;
        tomatoPrice = 1.11f;
        bananaPrice = 0.95f;
        eggplantPrice = 5.00f;

        float a = (pearPrice * pear + applePrice * apple + tomatoPrice * tomato + bananaPrice * banana + eggplantPrice * eggplant);
        float totalPrice = Math.round(a * 100) / 100f; // for 2 digits after decimal

        System.out.println("Total Amount: " + totalPrice + " TL");
        
    }
}