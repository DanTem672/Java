import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x1, x2, y1, y2;
        Scanner input = new Scanner(System.in);
        System.out.println("Координаты первой точки");
        x1 = input.nextInt();
        y1 = input.nextInt();
        System.out.println("Координаты второй точки");
        x2 = input.nextInt();
        y2 = input.nextInt();
        System.out.printf("Растояние между точками = %f", Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2))));
    }
}
