import java.util.Arrays;
import java.util.Scanner;
class ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int num = in.nextInt();
        double[] array = new double[num];
        int counter = 1;

        for (int i = 0; i < num; i++) {
            array[i] = Math.pow(-1, i) * counter;
            counter += 2;
        }
    System.out.println(Arrays.toString(array));
    }
}