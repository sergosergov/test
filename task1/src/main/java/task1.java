import java.util.Scanner;
import com.google.gson.*;

public class task1 {
    static class hello {

        int a;
        String b;
    }
    public static void main(String[] args) {

         hello C=new hello();
         C.a=10;
         C.b="hello";

         Gson W=new Gson();

         /*int n = 10;

        int[] mass = new int[n];

        for (int i = 0; i < n; i++) {

            mass[i] = 0 + (int) (Math.random() * n);
            System.out.print(mass[i] + " ");
        }

        int b;
        System.out.println("\nОбратный массив: ");
        for (int i = 0; i < n / 2; i++) {
            b = mass[i];
            mass[i] = mass[n - i - 1];
            mass[n - i - 1] = b;
        }
        for (int i = 0; i < n; i++)
            System.out.print(mass[i] + " ");
        System.out.println();*/
    }
}
