import java.util.Scanner;
class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = sc.nextInt();
        while (k <= m) {
            if (k % 3 == 0) {
                System.out.println(k);
            }
            k++;
        }
    }
}