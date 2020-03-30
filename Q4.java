import java.util.Random;

public class Q4 {

    public static void main(String[] args) {
        //Q4
        Random rand = new Random();

        int num1 = rand.nextInt(100);
        int num2 = rand.nextInt(100);
        int largest = Math.max(num1,num2);
        System.out.println("Num1 : "+num1);
        System.out.println("Num2 : "+num2);
        System.out.println("Larger value: "+ largest);
    }
}
