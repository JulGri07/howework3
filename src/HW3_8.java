import java.math.*;
import java.util.Scanner;

public class HW3_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter hours");
        double hours = scanner.nextDouble();
        if (hours < 0){
            System.out.println("invalid time");
            return;
        }
        System.out.printf("The number of litres Nathan will drink is %.0f", countRoundedLitres(hours));
    }
    static double countRoundedLitres(double hours) {
        return Math.floor(hours * 0.5);
    }

}
