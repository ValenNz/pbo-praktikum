public class Main4 {
    public static void main(String[] args) {
        double m[][];
        m = new double[4][4];
        m[0][0] = 1; m[1][1] = 1; m[2][2] = 1; m[3][3] = 1;

        System.out.println("--- Output Array Rectangular ---");
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }

        int twoDim[][] = new int[2][];
        twoDim[0] = new int[2];
        twoDim[1] = new int[3];

        twoDim[0][0] = 1; twoDim[0][1] = 4;
        twoDim[1][0] = 1; twoDim[1][1] = 4; twoDim[1][2] = 4;

        System.out.println("--- Output Array Non-Rectangular ---");
        System.out.println(twoDim[0][0]);
        System.out.println(twoDim[0][1]);
        System.out.println(twoDim[1][0]);
        System.out.println(twoDim[1][1]);
        System.out.println(twoDim[1][2]);
    }
}
