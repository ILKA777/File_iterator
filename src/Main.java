import Iterator.*;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите путь к файлу: ");


        boolean flag = true;
        do {
            try {
                String path = in.nextLine();
                FileIterator it = new FileIterator(path);
                flag = true;
                try {
                    while (it.hasNext()) {
                        String str = it.next();
                        System.out.println(str);
                    }
                } finally {
                    System.out.println("Больше строк в файле нет");
                }
            } catch (FileNotFoundException exp) {
                flag = false;
                System.out.println("Введен некорректный путь к файлу");
                System.out.print("Введите путь еще раз: ");
            }
        } while (flag == false);

    }
}