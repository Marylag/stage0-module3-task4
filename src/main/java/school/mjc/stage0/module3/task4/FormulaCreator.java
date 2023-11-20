package school.mjc.stage0.module3.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;

        double result = ((9 * (a * a)) - (5 * b)) + 2 + a - 7;
        double result2 = (a + b - (4 * a * b)) / 2;
        double result3 = result * result2;

        System.out.println(result3);
    }
}
