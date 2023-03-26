import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        float a = in.nextInt();

        System.out.print("Введите второе число число: ");
        float b = in.nextInt();

        System.out.println("Введите оператор(+,-,/,*)");
        String operation = in.next();

        float res = 0;
        switch (operation) {
            case "+":
                res = a + b;
                System.out.println(res);
                break;
            case "-":
                res = a - b;
                System.out.println(res);
                break;
            case "/":
                res = a / b;
                System.out.println(res);
                break;
            case "*":
                res = a * b;
                System.out.println(res);
                break;

        }
    }
}
