import java.util.Scanner;
class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String star1 = "*";
        String star2 = "*";
        int space1 = num*2;
        int space2 = num;
        int space3 = num*2;
        System.out.println(" ".repeat(space1+1) + star1);
        for (int i = 1; i < num; i++) {
            star1 = "*" + star1 + "*";
            space1 -= 1;
            System.out.println(" ".repeat(space1 + 1) + star1);
        }
        System.out.println();

            System.out.println(" ".repeat(space2) + star2 + " ".repeat(space3 + 1) + star2);
            for (int x = 1; x < num; x++) {
                star2 = "*" + star2 + "*";
                space2 -= 1;
                space3 -= 2;
                System.out.println(" ".repeat(space2) + star2 + " ".repeat(space3 + 1) + star2);
        }
    }
}