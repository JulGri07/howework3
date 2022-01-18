import java.util.Scanner;

public class HW3_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter current color in lower case");

        String colorGreen = "green";
        String colorYellow = "yellow";
        String colorRed = "red";

        String currentColor = scanner.nextLine();


        if (currentColor.equals(colorGreen)) {
            System.out.println(colorYellow);
        }
        else if (currentColor.equals(colorYellow)) {
            System.out.println(colorRed);
        }
        else if (currentColor.equals(colorRed)) {
            System.out.println(colorGreen);
        }
        else {
            System.out.println("Invalid color");
        }


    }



}
