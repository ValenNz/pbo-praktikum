public class Main8 {
    public static void main(String[] args){
        int i;

        System.out.println("--- FOR LOOP ---");
        for(i = 1; i <= 10; i++){
            System.out.println(i);
        }

        System.out.println("--- WHILE LOOP ---");
        i = 1;
        while(i <= 10){
            System.out.println(i);
            i++;
        }

        System.out.println("--- DO WHILE LOOP ---");
        i = 1;
        do{
            System.out.println(i);
            i++;
        } while(i <= 10);
    }
}
