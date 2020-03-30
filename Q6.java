import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        //Q6
        //a
        Scanner input = new Scanner(System.in);
        //b
        System.out.println("Enter 2 integer: ");
        int x = input.nextInt();
        int y = input.nextInt();
        //c
        System.out.println("Product of " + x + " and "+ y + ": " + Math.multiplyExact(x,y));
    }
}
