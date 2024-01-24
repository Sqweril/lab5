package raw;

import java.util.Scanner;
// Framework: Java SE
// Technology stack: Java


public class PersData {
    private raw.Docs docs;
    private int age;
    private String fio;

    public PersData() {
        docs = new Docs();
        age = 0;
        fio = "Не указано";
    }

    public PersData(Docs docs, int age, String fio) {
        this.docs = docs;
        this.age = age;
        this.fio = fio;
    }

    public Docs getDocs() {
        return docs;
    }

    public int getAge() {
        return age;
    }

    public String getFio() {
        return fio;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tВвод персональных данных\n");
        docs.Input();
        System.out.println("Введите Возраст: ");
        age = scanner.nextInt();
        System.out.println("Введите ФИО: ");
        scanner.nextLine();
        fio = scanner.nextLine();
        if (!checkArguments(docs, age, fio)) {
            throw new IllegalArgumentException("Некорректный формат данных!");
        }
    }

    private boolean checkArguments(Docs docs, int age, String fio) {
        return age > 0;
    }
}