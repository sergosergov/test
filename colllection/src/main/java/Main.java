import java.util.Scanner;

public class Main {
    private static CommandList commandList = new CommandList();
    private static CommandDeque commandDeque = new CommandDeque();
    private static CommandDeque commandSet = new CommandDeque();
    private static CommandDeque commandMap = new CommandDeque();

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        while (true) {
            showOutMenu();
            switch (in.nextInt()) {
                case 1:
                    commandList.execute();
                    break;
                case 2:
                    commandDeque.execute();
                    break;
                case 3:
                    commandSet.execute();
                    break;
                case 4:
                    commandMap.execute();
                    break;
                default:
                    return;
                    
            }
        }
    }

    private static void showOutMenu() {
        System.out.println("Выберите тип коллекции:\n" +
                "1. List\n" +
                "2. Set\n" +
                "3. Deque\n" +
                "4. Map");
    }
}
