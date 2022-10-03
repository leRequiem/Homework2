import java.util.Scanner;
class ex3 {
    private static double sqrt(double x) {
        double temp;
        double result = x / 2;
        do {
            temp = result;
            result = (temp + x / temp) / 2;
        } while (temp - result != 0);
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();
        System.out.printf("%.6f\n", sqrt(num));
    }
}