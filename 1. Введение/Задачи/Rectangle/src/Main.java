import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int height, width;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину");
        height = input.nextInt();
        System.out.println("Введите ширину");
        width = input.nextInt();
        System.out.printf("Периметр = %d\n", (height + width)*2 );
        System.out.printf("Площадь = %d",height * width);
    }
}