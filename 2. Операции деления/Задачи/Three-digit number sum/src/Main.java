import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Вывести сумму цифр трёхзначного числа
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.printf("Sum = %d", (num / 100) + (num / 10 % 10) + (num % 10));
    }
}