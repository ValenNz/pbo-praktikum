public class Main7 {
    public static void main(String args[]){
        int month = 4;
        String season;

        if(month == 12 || month == 1 || month == 2){
            season = "Dingin";
        } else if(month == 3 || month == 4 || month == 5){
            season = "Semi";
        } else if(month == 6 || month == 7 || month == 8){
            season = "Panas";
        } else if(month == 9 || month == 10 || month == 11){
            season = "Gugur";
        } else{
            season = "";
        }
        System.out.println("Bulan April masuk musim " + season + ".");

        int hari = 7;
        String hariString;

        switch(hari){
            case 1: hariString = "Senin"; break;
            case 2: hariString = "Selasa"; break;
            case 3: hariString = "Rabu"; break;
            case 4: hariString = "Kamis"; break;
            case 5: hariString = "Jumat"; break;
            case 6: hariString = "Sabtu"; break;
            case 7: hariString = "Minggu"; break;
            default: hariString = "Invalid month"; break;
        }
        System.out.println("Hari ke-" + hari + " adalah " + hariString);

        int nilai = 3 > 2 ? 10 : 20;
        System.out.println("Nilai Ternary: " + nilai);
    }
}
