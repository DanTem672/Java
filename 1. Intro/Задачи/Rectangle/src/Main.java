import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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