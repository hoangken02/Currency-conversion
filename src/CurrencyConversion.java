import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1: USD - VND");
        System.out.println("2: VND - VND");
        int typeMoney = scanner.nextInt();

        System.out.println("Enter amount:");
        double amount = scanner.nextDouble();

        switch (typeMoney){
            case 1:
                amount *= 23000;
                System.out.println("Your money has value" + amount + "VND");
            case 2:
                amount /= 23000;
                System.out.printf("Your money has value %.3f USD",amount);
                break;
        }
    }
}
