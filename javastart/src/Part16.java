// OBject Oriented Programming 

//Calculator Class
class Calculator {

    public int add(int num1, int num2) {
        int r = num1 + num2;
        return r;
    }

}

// Main Class
public class Part16 {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;

        // create object
        Calculator clac = new Calculator();
        // clac.add();

        int result = clac.add(num1, num2);

        System.out.println(result);

    }
}
