import java.util.Scanner;
class ex9 {
    private static int reverse(int n) {
        int result = 0;
        int Current = 0;
        while (n != 0) {
            Current = n%10;
            result = (result + Current)*10;
            n/=10;
        }
        return result/10;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество цифр в числе: ");
        int counter = in.nextInt();
        double result = 1;
        int temp = 0;

        if (counter > 1) {
            System.out.println("Введите цифры: ");
        for (int i = 0; i < counter; i++) {
            int Current = in.nextInt();
            temp = (temp + Current) * 10;
        }
        }
        result = temp/10;
        System.out.println("Полученные числа: ");
        System.out.print((int) result + "   ");
        System.out.print(reverse((int) result));
    }
}