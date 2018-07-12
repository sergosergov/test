import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class CommandSet {

    private final Scanner in = new Scanner(System.in);

    public void execute() {
        Set set = new HashSet();

        while (true) {
            showOutMenu();
            switch (in.nextInt()) {
                case 1:
                    System.out.println("Содержимое:\n" + set);
                    break;
                case 2:
                    System.out.println("Пуст ли список: " + set.isEmpty());
                    break;
                case 3:
                    contains(set);
                    break;
                case 4:
                    add(set);
                    break;
                case 5:
                    remove(set);
                    break;

                default:
                    return;
            }
        }
    }

    private void contains(Set set) {
        System.out.print("Введите элемент: ");
        String item = in.next();
        System.out.println("Содержится ли элемент:" + set.contains(item));
    }

    private void add(Set set) {
        System.out.println("Введите элемент");
        String item = in.next();
        set.add(item);
        System.out.println("Добавлено.");
    }

    private void remove(Set set) {
        System.out.println("Введите элемент: ");
        int item = in.nextInt();
        set.remove(item);
        System.out.println("Удалено.");
    }

    private static void showOutMenu() {
        System.out.println("Выберите действие над коллекцией:\n" +
                "1. вывести список элементов коллекции\n" +
                "2. пуст ли список\n" +
                "3. содержит ли коллекция элемент (ожидается считывание элемента из консоли)\n" +
                "4. добавление элемента в конец списка (ожидается считывание элемента из консоли)\n" +
                "5. удаление элемента (ожидается считывание элемента из консоли)\n" +
                "6. возврат в меню выбора коллекции");
    }
}