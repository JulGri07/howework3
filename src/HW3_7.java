import java.util.Scanner;

public class HW3_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of petals on the first flower");
        int flower1 = scanner.nextInt();
        scanner.nextLine();
        //здесь могла быть валидация, но не сейчас
        System.out.println("Enter the number of petals on the second flower");
        int flower2 = scanner.nextInt();
        //здесь могла быть валидация, но не сейчас

        System.out.println("Your love is " + isLove(flower1, flower2));

    }
    public static boolean isLove(int flower1, int flower2) {
        return (flower1 % 2 ==0) ^ (flower2 % 2 == 0);
    }
}
