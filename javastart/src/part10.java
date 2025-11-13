public class part10 {
    public static void main (String [] args){
        String name = "Coding Guy"; 

        int length = name.length();

        char letter = name.charAt(0);

        int index = name.indexOf("o");

        int lastIndex = name.lastIndexOf("o");

        name = name.toUpperCase();
        name = name.toLowerCase();


        // Remove whitespace
        name = name.trim();

        //Replace characters

        name = name.replace("o", "e");

        // Check if the string is empty
        // boolean check = name.isEmpty();

        // Check if name contains a space
        // boolean check = name.contains(" ");

        //Check if strings match 
        boolean check = name.equals("Coding Guy");

        System.out.println(check);

    }
}
