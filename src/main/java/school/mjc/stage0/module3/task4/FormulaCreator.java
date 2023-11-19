package school.mjc.stage0.module3.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        double a = 1;
        double b = 1;

        double leftPart = 9 * Math.pow(a, 2) - 5 * b + 2 + a - 7;
        double rightPart = (a + b - 4 * a * b) / 2;
        double result = leftPart * rightPart;

        System.out.println("The result of the formula is: " + result);
    }
}
