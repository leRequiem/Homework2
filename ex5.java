import java.util.Scanner;
class ex5 {
    private static double Mcloren(double x) {
        double CurrentTerm = x;
        double PreviousTerm = x;
        int counter = 1;
        double result = x;

        while (PreviousTerm >= 1e-9){
            CurrentTerm = PreviousTerm * x * x / (counter*2) / (counter*2 + 1);
            result += CurrentTerm * Math.pow((-1), counter);
            PreviousTerm = CurrentTerm;
            counter += 1;
        }
            return result;
    }

        public static void main (String[] args){
            Scanner in = new Scanner(System.in);
            double num = in.nextDouble();
            System.out.printf("%.9f\n", Mcloren(num));
        }
}