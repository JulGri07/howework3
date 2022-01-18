import java.util.Scanner;

public class HW3_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean answer;

        System.out.println("Please, enter answer 'true' or 'false' and press Enter");

        answer = scanner.nextBoolean();

        System.out.println("Answer = "+ YesOrNo(answer));

    }
    static String YesOrNo(boolean answer) {
        return answer ? "Yes" : "No";
    }

}
