package raw;

import java.util.Scanner;


public class Voen {
    private PersData persdata;
    private int kategor;
    private int otsroch;
    private static int  voenCounter = 0;

    public static int getVoenCounter()
    {
        return voenCounter;
    }

    public Voen() {
        persdata = new PersData();
        kategor = 0;
        otsroch = 0;
        voenCounter++;
    }

    public Voen(PersData persdata, int kategor, int otsroch) {
        this.persdata = persdata;
        this.kategor = kategor;
        this.otsroch = otsroch;
        voenCounter++;
    }

    public PersData Getpersdata() {
        return persdata;
    }

    public int Getkategor() {
        return kategor;
    }

    public int Getotsroch() {
        return otsroch;
    }

    public void Setotsroch(int otsroch) {
        this.otsroch = otsroch;
    }

    private boolean CheckArguments(PersData persdata, int kategor, int otsroch) {
        return kategor > 0 && otsroch > 0;
    }

    public void Input() {
        PersData persdata = new PersData();
        int kategor;
        int otsroch;
        Scanner input = new Scanner(System.in);
        System.out.println("\tВвод данных призывника с военкомата");
        persdata.input();
        System.out.print("Введите категорию: ");
        kategor = input.nextInt();
        System.out.print("Введите отсрочку: ");
        otsroch = input.nextInt();
        if (CheckArguments(persdata, kategor, otsroch)) {
            this.persdata = persdata;
            this.kategor = kategor;
            this.otsroch = otsroch;
        } else {
            throw new IllegalArgumentException("Некорректный формат данных!");
        }
    }

    public void Print() {
        System.out.println("\tИнформация о призывнике с военкомата");
        System.out.println("ФИО: " + this.persdata.getFio() + "\tКатегория: " + this.kategor + "\tНаличие отсрочки: " + this.otsroch + "\n\n");
    }
}