import java.util.Scanner;

public class HW3_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int month;

        System.out.println("Please, enter month of the year and press Enter");

        month = scanner.nextInt();

        switch (month) {
            case 1: case 2: case 3:
                System.out.println("It's part of the first quarter");
                break;
            case 4: case 5: case 6:
                System.out.println("It's part of the second quarter");
                break;
            case 7: case 8: case 9:
                System.out.println("It's part of the third quarter");
                break;
            case 10: case 11: case 12:
                System.out.println("It's part of the fourth quarter");
                break;
            default:
                System.out.println("month is not valid");
                break;
        }
    }
}
