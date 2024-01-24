package raw;

// Framework and technology stack: Java

import java.util.Scanner;

public class SNILS {
    private long number;
    private int pol;

    public SNILS() {
        number = 0;
        pol = 0;
    }

    public SNILS(long number, int pol) {
        if (checkArguments(number, pol)) {
            this.number = number;
            this.pol = pol;
        } else {
            throw new IllegalArgumentException("Некорректный формат данных!");
        }
    }

    public long getNumber() {
        return number;
    }

    public int getPol() {
        return pol;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер СНИЛСа: ");
        long number = scanner.nextLong();
        System.out.print("Введите пол(1-мужской, 2-женский): ");
        int pol = scanner.nextInt();
        scanner.nextLine();
        if (checkArguments(number, pol)) {
            this.number = number;
            this.pol = pol;
        } else {
            throw new IllegalArgumentException("Некорректный формат данных!");
        }
    }

    private boolean checkArguments(long number, int pol) {
        return number > 0 && pol > 0 && pol < 3;
    }
}