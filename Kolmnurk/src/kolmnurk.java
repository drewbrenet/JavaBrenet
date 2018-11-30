import java.util.Scanner;
public class kolmnurk {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = 5;
        System.out.println("Pyramid:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
            //
        }
        s.close();
    }
}