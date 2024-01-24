package raw;

import java.util.Scanner;

public class Vus {
    private String name;
    private String fakul;
    private int kurse;
    private String naprav;

    public Vus() {
        name = "Не указано";
        fakul = "Не указано";
        kurse = 0;
        naprav = "Не указано";
    }

    public Vus(String name, String fakul, int kurse, String naprav) {
        this.name = name;
        this.fakul = fakul;
        this.kurse = kurse;
        this.naprav = naprav;
    }

    public String getName() {
        return name;
    }

    public String getFakul() {
        return fakul;
    }

    public int getKurse() {
        return kurse;
    }

    public String getNaprav() {
        return naprav;
    }

    public void Input() {
        Scanner input = new Scanner(System.in);
        System.out.println("\tВвод данных об учебном заведении\n");
        System.out.println("Введите название учебного заведения: ");
        input.nextLine();  // clear input buffer
        name = input.nextLine();
        System.out.println("Введите название факультета: ");
        fakul = input.nextLine();
        System.out.println("Введите курс: ");
        kurse = input.nextInt();
        input.nextLine();  // clear input buffer
        System.out.println("Введите название направления: ");
        naprav = input.nextLine();
    }
}