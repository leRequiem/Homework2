import java.util.Scanner;
class ex4{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble(), m = 2*r + 4, n = 2*r + 4, x = r + 1, y = r + 1;
        for (int y1 = 0; y1 < n; y1 += 1){
            for (int x1 = 0; x1 < m; x1 += 1){
                double gip = Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
                if (gip <= r){
                    System.out.print('o');
                }
                else{
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }
}