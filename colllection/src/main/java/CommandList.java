import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommandList {
    private final Scanner in = new Scanner(System.in);

    public void execute() {
        List list = new ArrayList();
        while (true) {
            showOutMenu();
            switch (in.nextInt()) {
                case 1:
                    System.out.println("Содержимое:\n" + list);
                    break;
                case 2:
                    System.out.println("Пуст ли список: " + list.isEmpty());
                    break;
                case 3:
                    contains(list);
                    break;
                case 4:
                    add(list);
                    break;
                case 5:
                    addByIndex(list);
                    break;
                case 6:
                    getByIndex(list);
                    break;
                case 7:
                    remove(list);
                    break;
                case 8:
                    removeByIndex(list);
                    break;
                default:
                    return;
            }
        }
    }

    private void removeByIndex(List list) {
        System.out.println("Введите индекс: ");
        int index = in.nextInt();
        list.remove(index);
        System.out.println("Удалено опо индексу " + index);
    }

    private void remove(List list) {
        System.out.println("Введите элемент: ");
        int item = in.nextInt();
        list.remove(item);
        System.out.println("Удален элемент " + item);
    }

    private void getByIndex(List list) {
        System.out.println("Введите индекс: ");
        int index = in.nextInt();
        System.out.println("Результат: " + list.get(index) );
    }

    private void addByIndex(List list){
        System.out.println("Введите элемент");
        String item=in.next();
        System.out.println("Введите индекс: ");
        int index=in.nextInt();
        System.out.println("Добавлено");
    }

    private void add(List list) {
        System.out.println("Введите элемент");
        String item = in.next();
        System.out.println("Добавлено: "+ list.add(item));
    }

    private void contains(List list) {
        System.out.print("Введите элемент: ");
        String item = in.next();
        System.out.println("Содержится ли элемент:" + list.contains(item));
    }

    private void showOutMenu() {
        System.out.println("Выберите действие над коллекцией:\n" +
                "1. вывести список элементов коллекции\n" +
                "2. пуст ли список\n" +
                "3. содержит ли коллекция элемент (ожидается считывание элемента из консоли)\n" +
                "4. добавление элемента в конец списка (ожидается считывание элемента из консоли)\n" +
                "5. добавление элемента на определенную позицию (ожидается считывание двух параметров из консоли: элемент и индекс)\n" +
                "6. получение элемента с определенной позиции (ожидается считывание индекса элемента из консоли)\n" +
                "7. удаление элемента (ожидается считывание элемента из консоли)\n" +
                "8. удаление элемента, находящегося на определенной позиции (ожидается считывание позиции элемента из консоли)\n" +
                "9. возврат в меню выбора коллекции");
    }
}