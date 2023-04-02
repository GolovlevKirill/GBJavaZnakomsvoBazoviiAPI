import java.util.Arrays;

// Task_1
// public class Task_1 {

// // Вам дается строка S и целочисленный массив индексов int index[s.length].
// // Напишите программу, которая перетасует символы в S таким образом,
// // что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
// //
// // Пример: s = “cba”, index = [3,2,1] result “abc”
// public static void main(String[] args) {

// }

// public String shuffle(final String s, final int[] index){

//     return "";
// }
// }

public class task_1 {
    public static void main(String args[]) {
        String s = "cda";
        System.out.print("s = " + '"');

        char[] strToArray = s.toCharArray();
        for(int i = 0; i < strToArray.length; i++){
            System.out.print(strToArray[i]);
        }
        System.out.print('"');
        System.out.println();
        
        // заполняем массив index-ов
            int[] index = new int[] {3, 2, 1,};
            System.out.print("index = ");
            System.out.println(Arrays.toString(index));

        System.out.print("result = ");
        for(int i = 0; i < strToArray.length; i++){
            System.out.print(strToArray[index[i]-1]);
        }
        System.out.println();



    //    String stones = "aaaAbbbB"; 
    //    char[] strToArray = stones.toCharArray(); // Преобразуем строку str в массив символов (char)
    //    // Вывод массива на экран
    //    int cnt_jwl_a = 0;
    //    int cnt_jwl_B = 0;
    //    char a = 'a';
    //    char b = 'B';
    //    for(int i = 0; i < strToArray.length; i++) {
    //       System.out.print(strToArray[i] + " "); // Для наглядности вставим пробел между индексами
    //       if(strToArray[i] == a){
    //         cnt_jwl_a = cnt_jwl_a + 1;
    //       }
    //       if(strToArray[i] == b){
    //         cnt_jwl_B = cnt_jwl_B + 1;
    //       }
    //     }
    //     System.out.println("\n" + "---------------");
    //     System.out.println("a" + cnt_jwl_a + "B" + cnt_jwl_B);
    }
 }