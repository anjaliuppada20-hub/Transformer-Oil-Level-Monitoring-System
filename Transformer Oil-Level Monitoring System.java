import java.util.Scanner;

public class TransformerOilLevel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Oil Level (%): ");
        double oilLevel = sc.nextDouble();

        System.out.println("\n--- Transformer Oil Level Monitoring ---");
        System.out.println("Oil Level: " + oilLevel + "%");

        if (oilLevel >= 70) {
            System.out.println("Status: NORMAL");
            System.out.println("Alarm: OFF");
        }
        else if (oilLevel >= 40) {
            System.out.println("Status: LOW");
            System.out.println("Warning: Check Oil Level");
            System.out.println("Alarm: ON");
        }
        else {
            System.out.println("Status: CRITICAL");
            System.out.println("Warning: Oil Level Very Low!");
            System.out.println("Alarm: ON");
            System.out.println("Transformer: CHECK REQUIRED");
        }

        sc.close();
    }
}
