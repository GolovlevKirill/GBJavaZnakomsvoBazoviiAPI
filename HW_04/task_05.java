//Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
// является ли входная строка логически правильной.
// Входная строка логически правильная, если:
// 1) Открытые скобки должны быть закрыты скобками того же типа.
// 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
// открытую скобку того же типа.
// ()[] = true
// () = true
// {[()]} = true
// ()() = true
// )()( = false

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayList;

public class task_05 {

public static void main(String[] args) {

    // String first = "{[]}";
    // ArrayList arraylist = new ArrayList();
    // arraylist.add('(');


    Deque<Character> deque = new ArrayDeque<>();

    String a = new String("{[()]}");
        System.out.println("Result: ");
        for(int i=0;i<a.length();i++)
        {
            // System.out.println("add char "+ a.charAt(i));
            deque.add(a.charAt(i));
        }

    System.out.println(deque);
    System.out.println();
    String res = "true";

    for (int i = 0; i <= deque.size(); i ++) {
        // System.out.println(deque);
        Character first = deque.pollFirst();
        Character last = deque.pollLast();

        if (first == '('){
            if (last != ')') res = "false";
        }

        if (first == '['){
           if (last != ']') res = "false";
        }

        if (first == '{'){
            if (last != '}') res = "false";
        }
    }


System.out.println(a + " = " + res);
}
}