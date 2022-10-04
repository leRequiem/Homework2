import java.util.Scanner;
class ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве: ");
        int num = in.nextInt();
        String[] array = new String[num+1];

        System.out.println("Введите строки самого массива: ");
        for (int i = 0; i < num; i++) {
            array[i] = in.nextLine();
        }

        System.out.println("Введите искомую подстроку: ");
        String substring = in.nextLine();

        for (int x = 0; x < array.length; x++) {
            if (array[x].contains(substring)) {
                System.out.println(x-1);
            }
        }
    }
}