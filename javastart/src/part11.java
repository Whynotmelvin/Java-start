public class part11 {
    public static void main (String [] args){
        int n = 4;
        int result = 0;
        if(n%2 == 0){
            result = 10;
        }else{
            result = 0;
        }

        // Ternary Operator

        result = n%2 == 0 ? 10 : 0;

        System.out.println(result);
    }
}
