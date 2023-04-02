// Task_2.
// Вводится число n, затем n чисел целых, по одному на каждой строке. 
// Затем вводится число, на которое нужно умножить все введённые выше числа. 
// Выведите на экран результат умножения построчно.

// Sample Input:

// 4
// 1
// 2
// 3
// 5
// 2
// Sample Output:

// 2
// 4
// 6
// 10

import java.util.Scanner;
 
public class task2 {
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите колличество чисел n: ");
        int n = in.nextInt();

        int arr[];
        arr = new int[n];
        int length = arr.length;
        
        for (int i = 0; i < length; i++){
            System.out.print("Введите число: ");
            int num = in.nextInt();
            arr[i] = num;
        }
        
        System.out.print("\nВведите число на которое нужно умножить: ");
            int multiplier = in.nextInt();

        System.out.println("\nРезультат: ");
        for (int i = 0; i < length; i++){
            
            arr[i] = arr[i] * multiplier;
            System.out.println(arr[i]);
        }

    }
}