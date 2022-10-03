import java.util.Scanner;
class ex6 {
    private static double[] calculation(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (a == 0){
            return new double[]{-c / b};
        }
        if (discriminant == 0){
            return new double[]{-b / 2 / a};
        }
        if (discriminant > 0){
            var result = new double[] {(-b+Math.sqrt(discriminant))/(2*a), (-b-Math.sqrt(discriminant))/(2*a)};
            return result;
        }
        return new double[] {};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        var solutions = calculation(a, b, c);
        String equation = a + "x^2 + " + b + "x + " + c + " = 0";
        System.out.println("Уравнение: ");
        System.out.print(equation);
        System.out.println();
        if (solutions.length == 0){
            System.out.println("Корней уравнения не существует");
        }
        else {
            System.out.println("Корни уравнения:");
            for (int i = 0; i < solutions.length; i++){
                System.out.println(solutions[i]);
            }
        }
    }
}