import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.printf("%d:%d:%d", num / 3600, (num % 3600) / 60, (num % 100) % 60);
    }
}