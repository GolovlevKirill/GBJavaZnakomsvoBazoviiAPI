import java.util.Arrays;

public class task_2 {
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
    }
}
