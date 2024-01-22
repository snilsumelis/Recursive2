import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int num = scanner.nextInt();
        minus(num);
    }
    static void minus(int n){
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        minus(n - 5);
        System.out.print(n + " ");

    }
}
