// 2.Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task_02 {
    public static void main(String[] args) {
        showEntryList(listOfSotrudniki);
    }

    public static List<String> listOfSotrudniki = new ArrayList<>(Arrays.asList(
        "Иван Иванов",
        "Светлана Петрова",
        "Кристина Белова",
        "Анна Мусина",
        "Анна Крутова",
        "Иван Юрин",
        "Петр Лыков",
        "Павел Чернов",
        "Петр Чернышов",
        "Мария Федорова",
        "Марина Светлова",
        "Мария Савина",
        "Мария Рыкова",
        "Марина Лугова",
        "Анна Владимирова",
        "Иван Мечников",
        "Петр Петин",
        "Иван Ежов"
        ));

        public static void showEntryList(List<String> sotrudniki) {
            Map<String, Integer> resultHashMap = new HashMap<>();
            // проверка на повторяющиеся имена
            for (String sotrudnik : sotrudniki) {
                String nameOfSotrudnik = sotrudnik.split(" ")[0];
                if (resultHashMap.containsKey(nameOfSotrudnik)) {
                    resultHashMap.put(nameOfSotrudnik, resultHashMap.get(nameOfSotrudnik) + 1);
                } else {
                    resultHashMap.put(nameOfSotrudnik, 1);// если будет 1 потом можно эти имена удалить
                }
            }
            
            removeRepeats(resultHashMap); // вызов метода для удаления повторяющихся имен
            
            List<Map.Entry<String, Integer>> lst = new ArrayList<>(resultHashMap.entrySet());
            lst.sort(Map.Entry.<String, Integer>comparingByValue().reversed());// сортировка по убыванию
            
            System.out.println(lst);
        }

        
        public static void removeRepeats(Map<String, Integer> map) {
            map.entrySet().removeIf(entry -> entry.getValue() == 1);
        }
        
}