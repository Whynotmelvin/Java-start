public class Part9 {
    public static void main(String[] args) {
        //printf()

        String name = "Spongebob";
        char firstletter = 'S';
        int age = 30;
        double height = 180.57364;
        boolean isEmployed = true;


        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with the letter %c\n", firstletter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("Hello %s, you're %d years old\n", name, age);

        //Percision in printf()
        System.out.printf("You're %.2f inches tall\n", height);

        //Comma grouping for numbers 

        double price1 = 9000000.0242;
        double price2  = 67232.903;
        double price3 = 4927634908732.212;

        System.out.printf("The values for price1 is %,f\n", price1);
        System.out.printf("The values for price2 is %,f\n", price2);
        System.out.printf("The values for price3 is %,f\n", price3);

    }
}
