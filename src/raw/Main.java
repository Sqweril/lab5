package raw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Пример работы с исключениями
        try {
            Pasport id = new Pasport(7454, -963464); // Пытаемся создать паспорт с отрицательным номером
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        // Пример работы с одномерными и двумерными массивами
        Scanner scanner = new Scanner(System.in);
        Voen[] cl = new Voen[4];
        int val;
        for (int i = 0; i < 4; i++) {
            cl[i] = new Voen();
            System.out.print("Введите кол-во посещений: ");
            val = scanner.nextInt();
            cl[i].Setotsroch(val);
            cl[i].Print();
        }
        Solder[][] solder = new Solder[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                solder[i][j] = new Solder();
                solder[i][j].Print();
            }
    }
}
