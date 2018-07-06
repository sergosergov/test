import java.lang.*;
import java.util.Date;
import java.util.Scanner;
import java.util.*;

public class cmstroka {

    public static void main(String[] args) {
        Map<String, exe> commands = new HashMap<String, exe>();
        commands.put("time", new time("time","shows time"));

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String desc = scan.nextLine();

        exe t =new time( "", "");
        t.execute();
        t.getName();
        t.getDesc();
    }
}
