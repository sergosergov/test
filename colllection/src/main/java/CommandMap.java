import java.util.*;

public class CommandMap {
    private final Scanner in = new Scanner(System.in);

    public void execute() {
        Map map = new HashMap();

        while (true) {
            showOutMenu();
            switch (in.nextInt()) {
                case 1:
                    System.out.println("Содержимое:\n" + map);
                    break;
                case 2:
                    System.out.println("Пуст ли список: " + map.isEmpty());
                    break;
                case 3:
                    get(map);
                    break;
                case 4:
                    put(map);
                    break;
                case 5:
                    remove(map);
                    break;

                default:
                    return;
            }
        }
    }

    private void get(Map map) {
        System.out.println("Введите элемент: ");
        String item = in.next();
        System.out.println("Элемент: " + map.get(item));
    }

    private void put(Map map) {
        System.out.println("Введите элемент: ");
        String item =in.next();
        System.out.println("Введите ключ: ");
        int key = in.nextInt();
        map.put(key,item);
        System.out.println("Вставлено.");
    }

    private void remove(Map map) {
        System.out.println("Введите элемент: ");
        String item = in.next();
        map.remove(item);
        System.out.println("Удален элемент " + item);
    }

    private void showOutMenu() {
        System.out.println("Выберите действие над коллекцией\n" +
                "1. вывести список элементов коллекции\n" +
                "2. пуст ли список\n" +
                "3. получение элемента коллекции, либо null в случае отсутствия (ожидается считывание элемента из консоли)\n" +
                "4. добавление элемента в коллекцию (ожидается считывание элемента из консоли)\n" +
                "5. удаление элемента из коллекции (ожидается считывание элемента из консоли)\n" +
                "6. возврат в меню выбора коллекции");
    }
}
