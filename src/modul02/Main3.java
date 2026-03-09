package modul02;

public class Main3 {
    public static void main(String[] args) {
        int[] variabelArray1;
        variabelArray1 = new int[5];
        variabelArray1[0] = 10;

        int[] variabelArray2 = new int[5];
        variabelArray2[1] = 20;

        int[] variabelArray3 = {5, 3, 23, 99, 22};

        int tampung = variabelArray3[2];
        variabelArray3[0] = variabelArray3[0] + variabelArray3[4];

        System.out.println("Isi Array 3 Indeks 0: " + variabelArray3[0]);
        System.out.println("Isi Array 3 Indeks 2: " + tampung);
    }
}
