import java.util.Scanner;
class exponenta{
    private static double exp(double x) {
        var difference = 0.00001D;
        var CurrentFactorial = 0;
        var result = 1D;
        var sum = 1D;

        while(true) {
            sum *= x / (CurrentFactorial + 1);
            result += sum;
            CurrentFactorial++;
            if (sum <= difference) break;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = (sc.nextInt());
    System.out.println(exp(num));
    }
}