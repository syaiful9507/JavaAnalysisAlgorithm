/**
 * Exercise
 */
public class Exercise {

    public static void main(String[] args) {
        String[] lg = {"A","B","C","D","E"};
        for (int i = 0; i < lg.length; i++) {
                //System.out.print(i + " milik i | ");
                System.out.print("*");
                System.out.println();
                System.out.println(lg[i]);
                if (i == 4) {
                    i = 5;
                }
                

            for (int j = 0; j <= i; j++) {
                //System.out.print(j + " milik j | ");
                System.out.print("*");

            }
        }
        System.out.println();
        System.out.println("Coba Tebak ini : " +  (5+5));
    }
}