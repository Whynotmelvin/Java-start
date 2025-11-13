import java.util.Random;
public class Part7 {
    public static void main(String[] args) {
        Random random = new Random();

        int number;
        double decimal;

        number = random.nextInt(1,7);

        decimal = random.nextDouble(1, 9);

        System.out.println(number);
        System.out.println(decimal);
    }
}
