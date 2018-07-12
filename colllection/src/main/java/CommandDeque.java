import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class CommandDeque {

    private final Scanner in = new Scanner(System.in);

    public void execute() {
        Deque deque = new LinkedList();

        while (true) {
            showOutMenu();
            switch (in.nextInt()) {
                case 1:
                    System.out.println("Содержимое:\n" + deque);
                    break;
                case 2:
                    System.out.println("Пуст ли список: " + deque.isEmpty());
                    break;
                case 3:
                    Contains(deque);
                    break;
                case 4:
                    addFirst(deque);
                    break;
                case 5:
                    addLast(deque);
                    break;
                case 6:
                    deque.getFirst();
                    break;
                case 7:
                    deque.getLast();
                    break;
                case 8:
                    deque.pollFirst();
                    break;
                case 9:
                    deque.pollLast();
                    break;
                case 10:
                    deque.removeFirst();
                    break;
                case 11:
                    deque.removeLast();
                    break;

                default:
                    return;
            }
        }
    }

    private void addFirst(Deque deque) {
        System.out.println("Введите элемент: ");
        String item = in.next();
        deque.addFirst(item);
        System.out.println("Добавлено в начало" );
    }

    private void addLast(Deque deque) {
        System.out.println("Введите элемент: ");
        String item = in.next();
        deque.addLast(item);
        System.out.println("Добавлено в начало" );
    }

    private void Contains(Deque deque) {
        System.out.println("Введите элемент: ");
        String item = in.next();
        System.out.println("Содержится ли элемент:" + deque.contains(item));
    }

    private static void showOutMenu () {
            System.out.println("Выберите действие над коллекцией:\n" +
                    "1. вывести список элементов коллекции\n" +
                    "2. пуст ли список\n" +
                    "3. содержит ли коллекция элемент\n" +
                    "4. добавить элемент в начало коллекции \n" +
                    "5. добавить элемент в конец коллекции\n" +
                    "6. получить первый элемент коллекции, при этом не удаляя его из самой коллекции (в случае отсутствия элементов в коллекции бросается NoSuchElementException)\n" +
                    "7. получить последний элемент коллекции, при этом не удаляя его из самой коллекции (в случае отсутствия элементов в коллекции бросается NoSuchElementException)\n" +
                    "8. получить первый элемент коллекции, удалив его при этом из самой коллекции (в случае отсутствия элементов в коллекции возвращается null)\n" +
                    "9. получить последний элемент коллекции, удалив его при этом из самой коллекции (в случае отсутствия элементов в коллекции возвращается null)\n" +
                    "10. удалить элемент из начала коллекции (возвращается удаленный элемент, в случае отсутствия элементов в коллекции бросается исключение NoSuchElementException)\n" +
                    "11. удалить элемент из конца коллекции (возвращается удаленный элемент, в случае отсутствия элементов в коллекции бросается исключение NoSuchElementException)\n" +
                    "12. возврат в меню выбора коллекции");
        }

}
