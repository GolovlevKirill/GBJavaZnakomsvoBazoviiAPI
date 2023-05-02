// package task_01;
// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, 
// что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class task_01{
    public static void main(String[] args) {
        // System.out.println("Add contacts to phonebook");
        AddNewContact("Иванов", "+7 926 345 3445");
        AddNewContact("Иванов", "+7 924 345 3434 ");
        AddNewContact("Суворова", "+7 989 392 6787");

        System.out.println("---------------------------------");
        System.out.println("В данный момент в книге имеются следующие записи:");
        System.out.println(PhoneBook);
        ShowEntryContact("Иванов");
        ShowEntryContact("Сергиенко");
    }
    //создание списка контактов
    public static Map<String, LinkedList<String>> PhoneBook = new HashMap<>();

    public static void ShowEntryContact(String name) {
        LinkedList<String> phoneNumbers = SearchPhoneNumbers(name);
        
        if (phoneNumbers == null) {
            System.out.printf("%s осутсвует в книге.\n", name);
        } else if (phoneNumbers.size() == 0) {
            System.out.printf("О %s нет записей.\n", name);
        } 
        else {
            System.out.printf("У %s имеются следующие номера: %s\n", name, String.join(", ", phoneNumbers));;
        }        
    }

    public static void AddNewContact(String name, String phoneNumber) {
        if (PhoneBook.containsKey(name)) {
            PhoneBook.get(name).add(phoneNumber);
        } else {
            LinkedList<String> numbers = new LinkedList<String>();
            numbers.add(phoneNumber);
            PhoneBook.put(name, numbers);
        }
    } 

    public static LinkedList<String> SearchPhoneNumbers(String name) {
        if (!PhoneBook.containsKey(name)) return null;
        return PhoneBook.get(name);
    }

    

    public static void RemoveContact(String name, String phoneNumber) {
        if (PhoneBook.containsKey(name)) {
            PhoneBook.get(name).remove(phoneNumber);
        }
    }
}