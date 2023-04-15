// 3. Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее из этого списка.


import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class task_03{
      
    public static void main(String[] args) {
        int n = 10;
        List<Integer> listInt = new ArrayList<>();
        
        for (int i = 0; i < n; i++){
            int a = (int) ( Math.random() * 100 );
            listInt.add(a);
        }
        System.out.println("Исходный список: ");
        System.out.println(listInt);

        System.out.println("Максимум из списка: ");
        Integer MAX = Collections.max(listInt);
        System.out.println(MAX);

        System.out.println("Минимум из списка: ");
        Integer MIN = Collections.min(listInt);
        System.out.println(MIN);
        int aver = 0;

        // Среднее значение:
        for (int i = 0; i<listInt.size(); i++){
            aver = aver + listInt.get(i);
        }

        double average_final = (double)aver / (double)listInt.size();
        System.out.println("Среднее значение:");
        System.out.println(average_final);
    }
}