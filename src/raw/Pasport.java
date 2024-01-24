package raw;

import java.util.Scanner;

public class Pasport {
    private int seria;
    private int number;

    public Pasport() {
        number = 0;
        seria = 0;
    }

    public Pasport(int seria, int number) {
        if (checkArguments(number, seria)) {
            this.number = number;
            this.seria = seria;
        } else {
            throw new IllegalArgumentException("Некорректный формат данных!");
        }
    }

    public int getSeria() {
        return seria;
    }

    public int getNumber() {
        return number;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите серию паспорта: ");
        seria = scanner.nextInt();
        System.out.print("Введите номер паспорта: ");
        number = scanner.nextInt();
        scanner.nextLine();
        if (checkArguments(seria, number)) {
            this.number = number;
            this.seria = seria;
        } else {
            throw new IllegalArgumentException("Некорректный формат данных!");
        }
    }

    private boolean checkArguments(int seria, int number) {
        return number > 0 && seria > 0;
    }
}