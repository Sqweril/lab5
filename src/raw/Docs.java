package raw;

import java.util.Scanner;


public class Docs {
    private raw.SNILS snils;
    private raw.Pasport pasport;

    public Docs() {
        snils = new raw.SNILS();
        pasport = new raw.Pasport();
    }

    public Docs(raw.SNILS snils, raw.Pasport pasport) {
        this.snils = snils;
        this.pasport = pasport;
    }

    public raw.SNILS getSNILS() {
        return snils;
    }

    public raw.Pasport getPasport() {
        return pasport;
    }

    public void Input() {
        raw.SNILS snils = new raw.SNILS();
        raw.Pasport pasport = new raw.Pasport();
        System.out.println("\tВвод документов");
        System.out.println("\tВвод СНИЛСА");
        snils.input();
        System.out.println("\tВвод паспорта");
        pasport.input();
        this.snils = snils;
        this.pasport = pasport;
    }
}