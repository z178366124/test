import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        System.out.println(max(1,2,3));
    }
    public static int max(int a, int b, int c) {
        int max = a;
        if (a > max) {
            max = a;
        }
        if ( b> max) {
            max = b;
        }
        return max;
    }
}