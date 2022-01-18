import java.util.Scanner;

public class HW3_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your height");
        double height = scanner.nextDouble();

        if (height<=0) {
            System.out.println("Incorrect height value");
            return;
        }

        System.out.println("Enter your weight");
        double weight = scanner.nextDouble();

        if (weight<=0) {
            System.out.println("Incorrect weight value");
            return;
        }
        System.out.println("Your BMI = " + bmiCalculate(height, weight));
    }
    static String bmiCalculate(double height, double weight) {
        double bmi = weight / (height * height);
        if (bmi <= 18.5)
            return "Underweight";
        else if (bmi <= 25.0)
            return "Normal";
        else if (bmi <= 30.0)
            return "Overweight";
        else
            return "Obese";
    }


}
