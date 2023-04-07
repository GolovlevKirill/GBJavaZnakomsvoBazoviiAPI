// 2. Пусть дан произвольный список целых чисел, удалить 
// из него чётные числа

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task_02{
      
    public static void main(String[] args) {
        // Scanner iScanner = new Scanner(System.in);
        int n = 10;
        List<Integer> listInt = new ArrayList<>();
        
        for (int i = 0; i < n; i++){
            int a = (int) ( Math.random() * 100 );
            listInt.add(a);
        }
        System.out.println("Исходный список: ");
        System.out.println(listInt);

        List<Integer> listDel = new ArrayList<>();

        for (int i = 0; i < n; i++){
            if (listInt.get(i) % 2 != 0){
                listDel.add(listInt.get(i));
            }   
        }

        System.out.println("Эллементы на удаление(не четные числа): ");
        System.out.println(listDel);

        for (int i = 0; i<listInt.size(); i++){
            for (int j = 0; j<listDel.size(); j++){
                if (listInt.get(i) == listDel.get(j)){
                    // System.out.println("Удаляю: ");
                    // System.out.println(listInt.get(i));
                    listInt.remove(i);
                }
            }
        }

        System.out.println("Итоговый list: ");
        System.out.println(listInt);
        
    }
}