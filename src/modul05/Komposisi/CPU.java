package modul05.Komposisi;

public class CPU {
    private String Merk;
    private int Kecepatan;

    public CPU(String m, int k) {
        this.Merk = m;
        this.Kecepatan = k;
    }

    public void DisplaySpecCPU() {
        System.out.println("CPU: " + this.Merk + ", " + this.Kecepatan + " GHz");
    }
}
