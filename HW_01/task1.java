// import java.util.Scanner;

// public class Program {
   
//     public static void main(String[] args) {
           
//         Scanner in = new Scanner(System.in);
//         System.out.print("Input name: ");
//         String name = in.nextLine();
//         System.out.print("Input age: ");
//         int age = in.nextInt();
//         System.out.print("Input height: ");
//         float height = in.nextFloat();
//         System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
//         in.close();
//     }
// }
// Scanner in = new Scanner(System.in);
// System.out.print("Input age: ");
// int age = in.nextInt();
// System.out.print("Input height: ");
// float height = in.nextFloat();
// System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
// in.close();


import java.util.Scanner;
 
public class task1 {
   
    public static void main(String[] args) {
        int arr[];
        arr = new int[1000];
        int length = arr.length;
        
        for (int i = 0; i < length; i++){
            arr[i] = i*i*i;
        }
        
        
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        
        System.out.println(arr[a]);
        System.out.println(arr[b]);
        
    }
}