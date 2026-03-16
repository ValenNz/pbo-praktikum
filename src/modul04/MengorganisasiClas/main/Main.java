package modul04.MengorganisasiClas.main;

import modul04.MengorganisasiClas.hargatoken.HargaToken;
import modul04.MengorganisasiClas.hargapulsa.HargaPulsa;

public class Main {
    public static void main(String[] args) {
        HargaToken objectToken = new HargaToken();
        objectToken.info();

        System.out.println();

        HargaPulsa objectPulsa = new HargaPulsa();
        objectPulsa.info();
    }
}