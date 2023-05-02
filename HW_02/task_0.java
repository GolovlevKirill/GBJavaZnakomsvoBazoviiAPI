// Task_0
// public class Task_0 {

// // Посчитайте сколько драгоценных камней в куче обычных камней
// // Пример:
// // jewels = “aB”, stones = “aaaAbbbB”
// // Результат в консоль ”a3B1”
// public static void main(String[] args) {

// }

// public String findJewelsInStones(String jewels, String stones) {

//     return "";
// }
// }

public class task_0 {
    public static void main(String args[]) {
       String stones = "aaaAbbbB"; 
       char[] strToArray = stones.toCharArray(); // Преобразуем строку str в массив символов (char)
       // Вывод массива на экран
       int cnt_jwl_a = 0;
       int cnt_jwl_B = 0;
       char a = 'a';
       char b = 'B';
       for(int i = 0; i < strToArray.length; i++) {
          System.out.print(strToArray[i] + " "); // Для наглядности вставим пробел между индексами
          if(strToArray[i] == a){
            cnt_jwl_a = cnt_jwl_a + 1;
          }
          if(strToArray[i] == b){
            cnt_jwl_B = cnt_jwl_B + 1;
          }
        }
        System.out.println("\n" + "---------------");
        System.out.println("a" + cnt_jwl_a + "B" + cnt_jwl_B);
    }
 }