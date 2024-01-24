package raw;

import java.util.Scanner;

public class Solder {
    private Voen voen;
    private Vkaf vkaf;
    private String data;
    private String time;
    private int status;

    public Solder() {
        voen = new Voen();
        vkaf = new Vkaf();
        data = "Не указано";
        time = "Не указано";
        status = 0;
    }

    public Solder(Voen voen, Vkaf vkaf, String data, String time, int status) {
        this.voen = voen;
        this.vkaf = vkaf;
        this.data = data;
        this.time = time;
        this.status = status;
    }

    public Voen getVoen() {
        return voen;
    }

    public Vkaf getVkaf() {
        return vkaf;
    }

    public String getData() {
        return data;
    }

    public String getTime() {
        return time;
    }

    public int getStatus() {
        return status;
    }

    public void SetStatus(int status) {
        this.status = status;
    }

    public void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tВвод данных о призывнике\n");
        voen.Input();
        System.out.println("Введите дату явки в военкомат: ");
        data = scanner.nextLine();
        System.out.println("Введите время явки в военкомат: ");
        time = scanner.nextLine();
        System.out.println("Введите (1-годен, 2- не годен): ");
        status = scanner.nextInt();
        if (!checkArguments(voen, vkaf, data, time, status)) {
            throw new IllegalArgumentException("Некорректный формат данных!");
        }
    }

    public void Print() {
        System.out.println("\tИнформация о призывнике\n");
        System.out.println("Дата: " + data + "\tВремя: " + time + "\t(1-годен, 2- не годен): " + status + "\n\n");
    }

    private boolean checkArguments(Voen voen, Vkaf vkaf, String data, String time, int status) {
        return status > 0 && status < 3;
    }


}