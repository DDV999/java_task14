import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число и нажмите Enter: ");
        String S = scan.nextLine();
        int X = Integer.parseInt(S);
        double Y = X;
        System.out.println("Переменная S(String): "+S);
        System.out.println("Переменная X(int): "+X);
        System.out.print("Переменная Y(double): "+Y);
        scan.close();
    }
}