import java.util.Scanner;
import java.util.Arrays;
class ex7{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int counter = 1;
        int maximum = 0;
        int[] array = new int[num];

        for (int i = 0; i < num; i++) {
            array[i] = in.nextInt();
            System.out.println(Arrays.toString(array));
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                counter += 1;
            } else {
                maximum = Math.max(maximum, counter);
                counter = 1;
            }
        }
        if (maximum == 3){
            System.out.println("Они существуют!");
        }
        else System.out.println("Такой последовательности не существует");
    }
}