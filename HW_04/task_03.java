// Task_3
// import java.util.ArrayDeque;
// import java.util.Arrays;
// import java.util.Deque;

// public class Task_3 {

// // Дан Deque состоящий из последовательности цифр.
// // Необходимо проверить, что последовательность цифр является палиндромом
// public static void main(String[] args) {
//     Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6));

// }


// public boolean checkOn(Deque<Integer> deque){

//     return false;
// }
// }


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class task_03 {

// Дан Deque состоящий из последовательности цифр.
// Необходимо проверить, что последовательность цифр является палиндромом
public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6));
    // Принимаем что последовательность - палиндром
        boolean res = true;
    // Циклом проверяем соответствие правой и левой части
        for (int i = 0; i < deque.size() / 2; i ++) {
            int first = deque.pollFirst();
            int last = deque.pollLast();
            if (last != first) {
                res = false;
                break;
            }
        }
        if (res == true){
            System.out.println("Последовательность - палиндром");
        } else System.out.println("Последовательность - НЕ палиндром");

    }    


    // public boolean checkOn(Deque<Integer> deque){

    //     return false;
    // }
}
